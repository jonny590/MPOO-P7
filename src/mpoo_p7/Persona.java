
package mpoo_p7;

/**
 *
 * @author Alonso Salinas
 */
public class Persona{
    private String nombre;
    private int edad;
    private String genero;

    public Persona() {
    }
/**
 * @param nombre es el nombre de la persona
 * @param edad es la edad de la persona
 * @param genero es el genero de la persona
 */
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void hablar(){
        System.out.println("Estoy hablando");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + 
                ", genero=" + genero + '}';
    }
}
