class Estudiante {
    private String nombre;
    private int edad;
    private String codigo;
    private String programa;
    private double promedio;
    private boolean activo;
  
    public Estudiante(String nombre, int edad, String codigo, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.programa = programa;
        this.promedio = 0.0;
        this.activo = true;
    }


    public String getNombre() { return this.nombre; }
    public int getEdad() { return this.edad; }
    public String getCodigo() { return this.codigo; }
    public String getPrograma() { return this.programa; }
    public double getPromedio() { return this.promedio; }
    public boolean isActivo() { return this.activo; }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
            System.out.println("[OK] Edad actualizada para " + this.nombre);
        } else {
            System.out.println("[ERROR] La edad no puede ser negativa.");
        }
    }

    public void setPrograma(String nuevoPrograma) {
        if (nuevoPrograma.length() >= 3) {
            this.programa = nuevoPrograma;
            System.out.println("[OK] Programa actualizado para " + this.nombre);
        } else {
            System.out.println("[ERROR] Programa inválido.");
        }
    }

    public void setPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 20) {
            this.promedio = nuevoPromedio;
            System.out.println("[OK] Promedio actualizado correctamente.");
        } else {
            System.out.println("[ERROR] El promedio debe estar entre 0 y 20.");
        }
    }

    // Activar o desactivar estudiante
    public void desactivar() {
        this.activo = false;
        System.out.println("[INFO] " + this.nombre + " ha sido desactivado.");
    }

    public void activar() {
        this.activo = true;
        System.out.println("[INFO] " + this.nombre + " ha sido reactivado.");
    }

    public void mostrarInformacionCompleta() {
        System.out.println("--------------------------------------------------");
        System.out.println("       INFORMACIÓN COMPLETA DEL ESTUDIANTE");
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Código: " + this.codigo);
        System.out.println("Programa: " + this.programa);
        System.out.println("Promedio Académico: " + this.promedio);
        System.out.println("Estado: " + (this.activo ? "Activo" : "Inactivo"));
        System.out.println("--------------------------------------------------\n");
    }

    public void evaluarRendimiento() {
        if (this.promedio >= 11) {
            System.out.println(this.nombre + " está APROBADO con " + this.promedio);
        } else {
            System.out.println(this.nombre + " está DESAPROBADO con " + this.promedio);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("\n======== CREACIÓN DE OBJETOS ========\n");

        Estudiante ana = new Estudiante("Ana López", 16, "U2025123", "Ingeniería de Sistemas");
        Estudiante pablo = new Estudiante("Pablo Ruiz", 15, "U2025456", "Ingeniería Industrial");

        ana.mostrarInformacionCompleta();
        pablo.mostrarInformacionCompleta();

        System.out.println("\n======== DEMOSTRACIÓN DE ENCAPSULACIÓN ========\n");

        ana.setEdad(17);
        pablo.setEdad(-5);

        ana.setPrograma("Software");
        pablo.setPrograma("A");

        ana.setPromedio(16.5);
        pablo.setPromedio(25);
      
        System.out.println("\n======== ESTADO FINAL ========\n");

        ana.mostrarInformacionCompleta();
        pablo.mostrarInformacionCompleta();

        ana.evaluarRendimiento();
