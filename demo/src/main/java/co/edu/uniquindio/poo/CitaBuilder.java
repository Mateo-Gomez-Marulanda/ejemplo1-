package co.edu.uniquindio.poo;

import java.time.LocalDate;

public interface CitaBuilder{

    void tipoCita(String tipoCita);
    void fechaInicio (LocalDate fechaInicio);
    void fechaFin (LocalDate fechaFin);
    void consultorio (String consultorio);
    void medico (Medico medico);
    void paciente (Paciente paciente);
    Cita build();
}