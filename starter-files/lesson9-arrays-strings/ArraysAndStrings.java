/******************************************************************************

Lección 9: Arrays y Cadenas (Strings)
Conceptos: arreglos de objetos, recorrido con bucles y búsqueda de texto.

*******************************************************************************/

class Estudiante {
    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    // TODO: Agregar método para mostrar información del estudiante

    // TODO: Agregar método para evaluar el desempeño según la nota
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Listado de Estudiantes ===\n");

        // TODO: Crear un array de objetos Estudiante

        // TODO: Inicializar el array con algunos estudiantes

        // TODO: Recorrer el array y mostrar información de cada estudiante

        // Búsqueda por nombre
        System.out.println("\n=== Buscando un estudiante ===");

        // TODO: Pedir o definir una cadena a buscar

        // TODO: Recorrer el array y comparar nombres con equalsIgnoreCase

        // TODO: Indicar si se encontró o no
    }
}
