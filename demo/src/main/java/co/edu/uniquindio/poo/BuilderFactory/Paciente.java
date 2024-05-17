package co.edu.uniquindio.poo.BuilderFactory;

class Paciente {

    private String nombre;
    private String apellido;
    private String id;
    private int edad;
    private String direccion;

    public Paciente(String nombre, String apellido, String id, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.direccion = direccion;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre +
                ", apellido=" + apellido +
                ", id=" + id +
                ", edad=" + edad +
                ", direccion=" + direccion +
                "]";
    }

}
