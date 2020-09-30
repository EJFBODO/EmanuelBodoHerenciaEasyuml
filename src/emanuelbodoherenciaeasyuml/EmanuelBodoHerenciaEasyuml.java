package emanuelbodoherenciaeasyuml;

public class EmanuelBodoHerenciaEasyuml {

    public static void main(String[] args) {
        Persona uno;
        Alumno dos;
        Docente tres;

        uno = new Persona("Juan", "Perez", 36789543);

        uno.mostrar();

        dos = new Alumno("Gustavo", "Montoya", 34654789, 74);

        dos.mostrar();
        

        tres = new Docente("Jose", "Gonzalez", 25786435, 25, (short) 12);

        tres.mostrar();

    }

}
