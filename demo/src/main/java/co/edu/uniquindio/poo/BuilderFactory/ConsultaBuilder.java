package co.edu.uniquindio.poo.BuilderFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.Observer.Observer;
import co.edu.uniquindio.poo.Observer.Subject;

// Clase que construye una cita médica y también actúa como sujeto observable.
public class ConsultaBuilder implements CitaBuilder, Subject {

    private String tipoCita;
    private LocalDate fechaCita;
    private String consultorio;
    private Medico medico;
    private Paciente paciente;

    // Lista de observadores registrados
    private List<Observer> observers = new ArrayList<>();
    // Estado de la cita
    private String estado;

    // Constructor
    public ConsultaBuilder() {
        // Inicializar la lista de observadores
        observers = new ArrayList<>();
    }

    // Método para establecer el tipo de cita.
    @Override
    public void tipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    // Método para establecer la fecha de la cita.
    @Override
    public void fechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    // Método para establecer el consultorio de la cita.
    @Override
    public void consultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    // Método para establecer el médico de la cita.
    @Override
    public void medico(Medico medico) {
        this.medico = medico;
    }

    // Método para establecer el paciente de la cita.
    @Override
    public void paciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // Método para obtener el estado de la cita.
    public String getEstado() {
        return estado;
    }

    // Método para establecer el estado de la cita y notificar a los observadores.
    public void setEstado(String estado) {
        this.estado = estado;
        notifyObservers();
    }

    // Método para verificar si la cita está a un día de finalizar y actualizar el estado si es el caso.
    public void checkFechaFin() {
        if (fechaCita != null && LocalDate.now().plusDays(1).equals(fechaCita)) {
            setEstado("La cita está a un día de finalizar");
        }
    }

    // Método para añadir un observador a la lista de observadores.
    @Override
    public void addObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    // Método para notificar a todos los observadores registrados.
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(estado);
        }
    }

    // Método para eliminar un observador de la lista de observadores.
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

        // Método para obtener la lista de observadores.
    @Override
    public List<Observer> getObservers() {
            return observers;
        }

    // Método para construir la cita médica.
    @Override
    public Cita build() {
        // Construir la cita con los detalles establecidos.
        Cita cita = new Cita() {};
        cita.setTipoCita(tipoCita);
        cita.setFechaCita(fechaCita);
        cita.setConsultorio(consultorio);
        cita.setMedico(medico);
        cita.setPaciente(paciente);
        // Verificar la fecha de fin de la cita.
        checkFechaFin();
        return cita;
    }
}
