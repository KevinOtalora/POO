package POO;

public class Rectangulo extends Figura {
    private float ancho;
    private float largo;
    
    public Rectangulo(float ancho, float largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void calcularArea(){
        float area=largo*ancho;
        System.out.println("El ancho del rectangulo es: "+ancho+", el largo del rectangulo es "+largo
        +" y el area del rectangulo es: "+area);
    }
}
