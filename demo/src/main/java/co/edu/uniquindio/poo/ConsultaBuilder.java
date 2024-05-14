package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ConsultaBuilder implements CitaBuilder {

    private String tipoCita;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String consultorio;
    private Medico medico;
    private Paciente paciente;



    public void consultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public void fechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void fechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void medico(Medico medico) {
        this.medico = medico;
    }

    public void paciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void tipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public Cita build() {
        Cita cita = new Cita();
        cita.setTipoCita(tipoCita);
        cita.setPaciente(paciente);
        cita.setMedico(medico);
        cita.setFechaInicio(fechaInicio);
        cita.setFechaFin(fechaFin);
        cita.setConsultorio(consultorio);
        return cita;
    }
    
}

