/******************************************************************************

Lección 8: Encapsulación
Conceptos: atributos privados, getters, setters y acceso controlado.

*******************************************************************************/
class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters (leer valores)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters (modificar valores)
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Crear objeto Persona y probar getters y setters
    }
}
