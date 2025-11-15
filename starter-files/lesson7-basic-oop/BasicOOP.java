/******************************************************************************

Lección 7: Programación Orientada a Objetos (POO básica)
Conceptos: clases, objetos, atributos, constructor y métodos.

*******************************************************************************/
class Perro {
    String nombre;
    int edad;

    // Constructor
    public Perro(String n, int e) {
        nombre = n;
        edad = e;
    }

    // Método (comportamiento)
    void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Crear objetos de Perro y llamar a sus métodos
    }
}
