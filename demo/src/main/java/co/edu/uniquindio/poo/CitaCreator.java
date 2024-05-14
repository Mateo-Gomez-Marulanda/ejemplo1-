package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class CitaCreator {
    private CitaBuilder builder;

    public CitaCreator(CitaBuilder builder) {
        this.builder = builder;
    }

    public Cita constructor(String tipoCita, LocalDate fechaInicio, LocalDate fechaFin, String consultorio, Medico medico, Paciente paciente) {

        builder.tipoCita(tipoCita);
        builder.fechaInicio(fechaInicio);
        builder.fechaFin(fechaFin);
        builder.consultorio(consultorio);
        builder.medico(medico);
        builder.paciente(paciente);
        return builder.build();



    }
}
