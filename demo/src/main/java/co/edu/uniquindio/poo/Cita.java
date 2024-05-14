package co.edu.uniquindio.poo;

import java.time.LocalDate;

abstract class Cita implements Procedimiento{
    protected String tipoCita;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected String consultorio;
    protected Medico medico;
    protected Paciente paciente;
    protected String procedimiento;

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

    @Override
    public void elegirProcedimiento(){
        System.out.println("EL prodedimiento que escogio es: " +  procedimiento);
    }

    @Override
    public String toString() {
        return "Cita [tipoCita=" + tipoCita + 
        ", fechaInicio=" + fechaInicio + 
        ", fechaFin=" + fechaFin + 
        ", consultorio=" + consultorio + 
        ", medico=" + medico + 
        ", paciente=" + paciente +
        ", procedimiento=" + procedimiento +
        "]";
    }

    

}
