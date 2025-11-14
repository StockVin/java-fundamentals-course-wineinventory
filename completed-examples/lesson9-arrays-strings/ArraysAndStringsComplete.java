// Ejemplo: Estructuras de datos simples (arrays y cadenas) con objetos

// Clase Estudiante: representa un alumno con nombre y nota
class Estudiante {
    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
    }

    // Método para evaluar el desempeño
    public String evaluarDesempeno() {
        if (nota >= 17) {
            return "Excelente :)";
        } else if (nota >= 13) {
            return "Aprobado c:";
        } else {
            return "Desaprobado :c";
        }
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Listado de Estudiantes ===\n");

        // Crear un array de objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[4];

        // Agregar elementos (instanciación dentro del array)
        estudiantes[0] = new Estudiante("María", 18.5);
        estudiantes[1] = new Estudiante("Luis", 14.0);
        estudiantes[2] = new Estudiante("Ana", 12.5);
        estudiantes[3] = new Estudiante("Carlos", 16.0);

        // Recorrer el array e imprimir información
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarInfo();
            System.out.println("Desempeño: " + estudiantes[i].evaluarDesempeno());
            System.out.println("---------------------------------");
        }

        // Ejemplo de manipulación de cadenas
        System.out.println("\n=== Buscando un estudiante ===");
        String busqueda = "ana"; // cadena en minúsculas
        boolean encontrado = false;

        for (Estudiante e : estudiantes) {
            // Comparamos ignorando mayúsculas/minúsculas
            if (e.getNombre().equalsIgnoreCase(busqueda)) {
                System.out.println("¡Encontrado! " + e.getNombre() + " tiene nota " + e.getNota());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró a " + busqueda);
        }
    }
}
