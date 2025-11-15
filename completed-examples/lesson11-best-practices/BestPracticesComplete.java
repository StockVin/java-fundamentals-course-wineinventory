// ====================================================================
//                       CLASE MAIN
// ====================================================================
//
// Esta clase ejecuta todo el programa.
// Contiene demostraciones prácticas, validaciones, errores típicos,
// buenas prácticas y comparaciones de Strings.
//
// ====================================================================

public class Main {
    public static void main(String[] args) {
      
        // ---------------------------------------------------------------
        // ERROR COMÚN: Comparación de Strings
        // ---------------------------------------------------------------
        System.out.println("\n======== COMPARACIÓN DE STRINGS ========\n");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("Comparando s1 y s2 con '==': " + (s1 == s2));
        System.out.println("Comparando s1 y s3 con '==': " + (s1 == s3));
        System.out.println("Comparando s1 y s3 con equals(): " + s1.equals(s3));

        System.out.println("\nNota: == compara memoria; equals() compara contenido.\n");


        // ---------------------------------------------------------------
        // FIN DEL PROGRAMA
        // ---------------------------------------------------------------
        System.out.println("======== FIN DEL PROGRAMA ========");
    }
}
