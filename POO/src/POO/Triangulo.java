package POO;

public class Triangulo extends Figura {
    private float base;
    private float altura;
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        float area=base*altura;
        System.out.println("La base del rectangulo es "+base+", la altura del rectangulo es "+altura
        +" y el area del rectangulo es: "+area);
    }
}
