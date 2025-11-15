/*
Métodos (funciones) y parámetros
*/


//Método simple

public static void saludar() {
    System.out.println("Hola desde un método!");
}

public static void main(String[] args) {
    saludar();
}

//Método con parámetros

public static void saludarA(String nombre) {
    System.out.println("Hola " + nombre);
}

public static void main(String[] args) {
    saludarA("Ana");
}

//Método que retorna un valor

public static int sumar(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    int resultado = sumar(4, 6);
    System.out.println("Resultado: " + resultado);
}
