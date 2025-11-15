/*
Entrada y salida básica (Scanner y consola)
*/
//Clase de java
import java.util.Scanner;


//entrada de texto
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

       
        System.out.println("Hola: " + nombre);
        
    }
}


//entrada de numero enteros

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        
        System.out.println("Tu edad es: " + edad);
        
    }
}


//Entrada de Texto y numeros

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();

        System.out.println("Resumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }
}
