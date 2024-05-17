package co.edu.uniquindio.poo.BuilderFactory;

import java.time.LocalDate;

public interface CitaBuilder{

    void tipoCita(String tipoCita);
    void fechaCita (LocalDate fechaCita);
    void consultorio (String consultorio);
    void medico (Medico medico);
    void paciente (Paciente paciente);
    Cita build();
}