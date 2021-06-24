package mpoo_p4;

public class Perro {
    String nombre;
    String raza;
    String color;

    public Perro() {
    }

    public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    public void dormir(){
        System.out.println("Estoy durmiendo, no me despiertes");
    }
    
    public void ladrar(){
        System.out.println("¡GUAU! ¡GUAU!");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
}
