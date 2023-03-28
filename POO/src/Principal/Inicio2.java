package Principal;
import Salud.Persona2;
import java.util.Scanner;
public class Inicio2 {
    public static void main(String[] args) {
        double peso, estatura , resultado;
        Scanner lectura=new Scanner(System.in);
        Persona2 ejct=new Persona2();
        ejct.pedirDatos();
        System.out.println("Por favor dijite su estatura");
        estatura=lectura.nextDouble();
        System.out.println("Por favor dijite su peso (En kg)");
        peso=lectura.nextDouble();
        ejct.mostrarPersona();
        resultado=ejct.calcularImc(peso, estatura);
        if (resultado<=20) {
            System.out.println("Su IMC es: "+resultado+" PESO BAJO");
        }else if (resultado>20 && resultado<=25) {
            System.out.println("Su IMC es: "+resultado+" PESO IDEAL");
        }else if (resultado>25) {
            System.out.println("Su IMC es: "+resultado+" SOBRE PESO");
        }
    }
}
