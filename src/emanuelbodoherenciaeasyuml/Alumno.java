package emanuelbodoherenciaeasyuml;

import java.util.ArrayList;
import java.util.Arrays;

public class Alumno extends Persona {

    private int padron;
    private ArrayList<Float> notas = new ArrayList<Float>(Arrays.asList(6.00f, 7.00f, 9.50f));

    public Alumno(String nombre, String apellido, long dni, int padron) {
        super(nombre, apellido, dni);
        this.padron = padron;
    }

    public Alumno(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    public void setPadron(int padron) {
        this.padron = padron;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    public int getPadron() {
        return padron;
    }

    public float getPromedio() {

        float sumatoria = 0;
        float promedio;
        for (int i = 0; i <= notas.size(); i++) {

           sumatoria = sumatoria + notas.get(i);
        }

        promedio = sumatoria / notas.size();
        return promedio;

    }

    @Override
    public void mostrar() {
        System.out.println("\nPadron:" + padron + "\nNotas:" + notas);

    }

}
