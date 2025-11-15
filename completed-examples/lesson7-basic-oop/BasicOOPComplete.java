// Clase Perro: ejemplo básico de POO
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

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear (instanciar) objetos
        Perro perro1 = new Perro("Rocky", 2);
        Perro perro2 = new Perro("Max", 4);

        // Llamar al método ladrar()
        perro1.ladrar();
        perro2.ladrar();
    }
}
