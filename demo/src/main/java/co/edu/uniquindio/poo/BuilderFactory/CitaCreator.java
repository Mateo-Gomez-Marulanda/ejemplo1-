package co.edu.uniquindio.poo.BuilderFactory;

import java.time.LocalDate;


class CitaCreator {
    // Builder utilizado para construir la cita
    private CitaBuilder builder;


    public CitaCreator(CitaBuilder builder) {
        this.builder = builder;
    }

    // Método para construir una cita utilizando los datos proporcionados
    public Cita constructor(String tipoCita, LocalDate fechaCita, String consultorio, Medico medico, Paciente paciente) {
        // Establecer los detalles de la cita en el Builder
        builder.tipoCita(tipoCita);
        builder.fechaCita(fechaCita);
        builder.consultorio(consultorio);
        builder.medico(medico);
        builder.paciente(paciente);
        // Construir y retornar la cita
        return builder.build();
    }
}
