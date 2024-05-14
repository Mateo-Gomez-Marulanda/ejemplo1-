package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        CitaBuilder builder = new ConsultaBuilder();
        CitaCreator creator = new CitaCreator(builder);

        builder = new ConsultaBuilder();
        creator = new CitaCreator(builder);

        Medico medico = new Medico("Juan", "Perez", LocalDate.now(), null);

        Paciente paciente = new Paciente("Sebastian", "Reyes", "109732498", 23, "Bartio nueva granada 02-03");

        creator.constructor("consulta", LocalDate.now(), LocalDate.now().plusDays(7), "consultorio 08", medico,
                paciente);
        Cita consulta = builder.build();

        System.out.println(consulta);

    }
}
