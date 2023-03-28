package POO;

public class Circulo extends Figura {
    private float radio;
    private double pi=3.14;
    
    public Circulo(float radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void calcularArea(){
        double area=pi*radio*radio;
        System.out.println("El radio del circulo es: "+radio+" Y el are del circulo es: "+area);
    }
}
