package co.edu.uniquindio.poo;

// Interfaz para definir los productos
interface Producto {
    void mostrarInfo();
}

// Clase base para todos los productos
abstract class ProductoBase implements Producto {
    protected String nombre;
    protected double precio;

    @Override
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }
}

// Clase concreta para los teléfonos
class Telefono extends ProductoBase {
    Telefono(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Clase concreta para las laptops
class Laptop extends ProductoBase {
    Laptop(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Interfaz para el Builder
interface ProductoBuilder {
    void construirNombre(String nombre);
    void construirPrecio(double precio);
    Producto construirProducto();
}

// Implementación del Builder para teléfonos
class TelefonoBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;

    @Override
    public void construirNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void construirPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public Producto construirProducto() {
        return new Telefono(nombre, precio);
    }
}

// Implementación del Builder para laptops
class LaptopBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;

    @Override
    public void construirNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void construirPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public Producto construirProducto() {
        return new Laptop(nombre, precio);
    }
}

// Clase Factory que utiliza los Builders para crear productos
class TiendaElectronica {
    // Método Factory que devuelve un Producto creado por un Builder específico
    static Producto crearProducto(ProductoBuilder builder) {
        // Aquí podríamos incluir lógica adicional, como la configuración del producto más, si es necesario
        return builder.construirProducto();
    }
}

// Ejemplo de uso del patrón Builder y Factory Method
public class Ejemplo {
    public static void main(String[] args) {
        // Crear un teléfono utilizando el Builder y Factory Method
        ProductoBuilder telefonoBuilder = new TelefonoBuilder();
        telefonoBuilder.construirNombre("iPhone 13");
        telefonoBuilder.construirPrecio(999.99);
        Producto telefono = TiendaElectronica.crearProducto(telefonoBuilder);
        telefono.mostrarInfo(); // Mostrar información del teléfono

        // Crear una laptop utilizando el Builder y Factory Method
        ProductoBuilder laptopBuilder = new LaptopBuilder();
        laptopBuilder.construirNombre("MacBook Pro");
        laptopBuilder.construirPrecio(1999.99);
        Producto laptop = TiendaElectronica.crearProducto(laptopBuilder);
        laptop.mostrarInfo(); // Mostrar información de la laptop
    }
}
