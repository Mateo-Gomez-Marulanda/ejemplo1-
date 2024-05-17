package co.edu.uniquindio.poo.Builder;

import java.time.LocalDate;

// Clase abstracta que representa una cita médica.
abstract class Cita {

    private String tipoCita;

    private LocalDate fechaCita;

    private String consultorio;

    private Medico medico;

    private Paciente paciente;

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // Método toString para obtener una representación en cadena de la cita
    @Override
    public String toString() {
        return "Cita [tipoCita=" + tipoCita +
                ", fechaCita=" + fechaCita +
                ", consultorio=" + consultorio +
                ", medico=" + medico +
                ", paciente=" + paciente +
                "]";
    }
}
