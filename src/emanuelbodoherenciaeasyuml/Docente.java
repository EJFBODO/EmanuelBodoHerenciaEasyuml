package emanuelbodoherenciaeasyuml;

public class Docente extends Persona {

    private int legajo;
    private short antiguedad;

    public Docente(String nombre, String apellido, long dni, int legajo, short antiguedad) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.antiguedad = antiguedad;
    }

    public Docente(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setAntiguedad(short antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getLegajo() {
        return legajo;
    }

    public short getAntiguedad() {
        return antiguedad;
    }

    @Override
    public void mostrar() {
        System.out.println("\nLegajo:" + legajo + "\nAntiguedad:" + antiguedad);

    }

}
