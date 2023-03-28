package Salud;
import java.util.Scanner;
public class Persona2 {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private double imc;

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Por favor dijite su tipo de documento");
        tipoDoc=lectura.next();
        System.out.println("Por favor dijite su numero de documento");
        documento=lectura.nextInt();
        System.out.println("Por favor dijite su nombre");
        nombre=lectura.next();
        System.out.println("Por favor dijite su apellido");
        apellido=lectura.next();
        System.out.println("Por favor dijite su edad");
        edad=lectura.nextInt();
        System.out.println("Por favor dijite su tipo de sexo (Masculino/Femenino)");
        sexo=lectura.next();
    }
    public double calcularImc(double peso, double estatura){
        double pesoA;
        imc=estatura*estatura;
        pesoA=peso/imc;
        return pesoA;
    }
    public void mostrarPersona(){
        System.out.println("Hola "+nombre+" "+apellido);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu tipo de documento es: "+tipoDoc);
        System.out.println("Tu numero de documento es: "+documento);
        //System.out.println("Tu peso es de "+peso+"kg");
        //System.out.println("Tu peso es de "+estatura+"M");
        System.out.println("Tu tipo de sexo es: "+sexo);
        if (edad>=18) {
            System.out.println("Y usted es mayor de edad");
        }else{
            System.out.println("Y usted no es mayor de edad");
        }
    }
    
}