package mpoo_p4;

public class Circulo {
    private static float PI = 3.1416f; //Ó float PI = (float) 3.1416
    private float radio;

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if(radio<0)
                radio = 0;
        this.radio = radio;
    }
    
    public float perimetro(){
        return 2*PI*radio;
    }
    
    public float area(){
        return PI*radio*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
