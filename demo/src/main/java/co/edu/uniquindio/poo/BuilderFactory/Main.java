package co.edu.uniquindio.poo.BuilderFactory;

import java.time.LocalDate;

import co.edu.uniquindio.poo.Observer.ConsultaObserver;
import co.edu.uniquindio.poo.Observer.Observer;

public class Main {

    public static void main(String[] args) {
        // Crear observadores
        Observer observer1 = new ConsultaObserver("Observer 1");
        Observer observer2 = new ConsultaObserver("Observer 2");

        // Crear médico y paciente
        Medico medico = new Medico("Juan", "Castañeda", LocalDate.now().plusDays(3), TipoEspecialidad.PEDIATRA);

        Paciente paciente = new Paciente("Pepe", "Perez", "12345", 15, "Barrio Nueva Granada 09-1");

        // Crear el builder y añadir observadores
        ConsultaBuilder consultaBuilder = new ConsultaBuilder();
        consultaBuilder.addObserver(observer1);
        consultaBuilder.addObserver(observer2);

        // Crear el creador de citas
        CitaCreator creador = new CitaCreator(consultaBuilder);

        // Construir la cita
         creador.constructor("Consulta", LocalDate.now().plusDays(1), "Consultorio 07", medico,
                paciente);
        
        Cita consulta = consultaBuilder.build();

        // Ver el resultado de la cita creada
        System.out.println("Consulta creada: " + consulta);
    }
}
