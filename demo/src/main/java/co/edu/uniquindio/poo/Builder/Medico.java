package co.edu.uniquindio.poo.Builder;

import java.time.LocalDate;

class Medico {

    private String nombre;
    private String apellido;
    private LocalDate disponivilidad;
    private TipoEspecialidad especialidad;

    public Medico(String nombre, String apellido, LocalDate disponivilidad, TipoEspecialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.disponivilidad = disponivilidad;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getDisponivilidad() {
        return disponivilidad;
    }

    public void setDisponivilidad(LocalDate disponivilidad) {
        this.disponivilidad = disponivilidad;
    }

    public TipoEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(TipoEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [nombre=" + nombre +
                ", apellido=" + apellido +
                ", disponivilidad=" + disponivilidad +
                ", especialidad=" + especialidad +
                "]";
    }

}
