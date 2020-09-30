package emanuelbodoherenciaeasyuml;

public class Persona {

    private String nombre, apellido;
    private long dni;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        System.out.println("Creando Persona...");
    }

    public Persona(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public void mostrar() {

        System.out.println("\nNombre:" + nombre + "\nApellido:" + apellido + "\ndni:" + dni);

    }

}
