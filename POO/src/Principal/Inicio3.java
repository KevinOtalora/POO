package Principal;
import Salud.Empleado;
import Salud.Persona3;
import java.util.Scanner;
public class Inicio3 {
    public static void main(String[] args) {
        String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        String cargo;
        double valorHora;
        int horasTrabajadas;
        String departamento;
    Persona3 ejecu=new Persona3();
    Empleado ejecuta=new Empleado();
    Scanner lectura=new Scanner(System.in);
    ejecu.pedirDatos();
    ejecuta.pedirDatos2();
    System.out.println("Hola "+ejecu.getNombre()+" "+ejecu.getApellido());
    System.out.println("Tu tipo de documento es: "+ejecu.getTipoDoc());
    System.out.println("Tu numero de documento es: "+ejecu.getDocumento());
    System.out.println("Tu cargo es: "+ejecuta.getCargo());
    System.out.println("Tu valor de horas es: "+ejecuta.getValorHora());
    System.out.println("Tus horas trabajadas son: "+ejecuta.getHorasTrabajadas());
    System.out.println("Tu departamento es: "+ejecuta.getDepartamento());
    ejecuta.calcularHonorarios();
    }
}
