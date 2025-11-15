/*

Estructuras de control: if-else y bucles (for, while)

*/


public class Main {
    public static void main(String[] args) {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

/*

Bucle for

*/


for (int i = 1; i <= 5; i++) {
    System.out.println("Iteración: " + i);
}

/*

Bucle while

*/
public class Main {
    public static void main(String[] args) {

	int contador = 0;
	while (contador < 3) {
    	System.out.println("Contador: " + contador);
    	contador++;
	}
     }
}
