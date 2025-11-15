public class Main {
    public static void main(String[] args) {
      
        System.out.println("\n======== COMPARACIÓN DE STRINGS ========\n");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("Comparando s1 y s2 con '==': " + (s1 == s2));
        System.out.println("Comparando s1 y s3 con '==': " + (s1 == s3));
        System.out.println("Comparando s1 y s3 con equals(): " + s1.equals(s3));

        System.out.println("\nNota: == compara memoria; equals() compara contenido.\n");
        System.out.println("======== FIN DEL PROGRAMA ========");
    }
}
