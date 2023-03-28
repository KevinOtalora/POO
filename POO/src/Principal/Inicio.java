package Principal;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona ejecutador=new Persona();
        ejecutador.pedirDatos();
        ejecutador.mostrarPersona();
        ejecutador.calcularImc();
    }
}
