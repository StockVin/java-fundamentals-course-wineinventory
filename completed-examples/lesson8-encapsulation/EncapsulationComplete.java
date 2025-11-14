// Clase Persona - ejemplo de encapsulación
class Persona {
    // Atributos privados (no accesibles directamente desde fuera)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter (permite leer un valor)
    public String getNombre() {
        return nombre;
    }

    // Setter (permite cambiar un valor)
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        // Validación simple
        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    // Método para mostrar info
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Instanciación simple: crear objetos de Persona
        Persona persona1 = new Persona("Luis", 20);

        // Mostrar información inicial
        persona1.mostrarInfo();

        // Cambiar el nombre usando el setter
        persona1.setNombre("Carlos");

        // Intentar cambiar la edad a un valor válido
        persona1.setEdad(25);

        // Mostrar información actualizada
        persona1.mostrarInfo();

        // Intentar cambiar la edad a un valor inválido
        persona1.setEdad(-5);
    }
}
