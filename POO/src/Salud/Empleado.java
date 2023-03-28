package Salud;
import java.util.Scanner;
public class Empleado extends Persona3 {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    
    public Empleado(String cargo, double valorHora, int horasTrabajadas, String departamento) {
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    Scanner lectura=new Scanner(System.in);

    public void pedirDatos2() {
        System.out.println("Ingresa tu cargo");
        cargo=lectura.next();
        System.out.println("Ingresa el valor por hora");
        valorHora=lectura.nextDouble();
        System.out.println("Ingresa la cantidad de horas trabajadas");
        horasTrabajadas=lectura.nextInt();
        System.out.println("Ingresa de que departamento eres");
        departamento=lectura.next();
    }

    public void calcularHonorarios() {
        double reteica=966;
        double totalPagar;
        totalPagar=(valorHora+horasTrabajadas)-reteica;
        System.out.println("El total a pagar es: "+totalPagar);
    }
}
