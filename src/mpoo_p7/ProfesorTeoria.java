/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p7;

/**
 *
 * @author Alonso Salinas
 */
public class ProfesorTeoria extends Profesor{
    private String numSalon;

    public ProfesorTeoria() {
    }
/**
 * @param numSalon es el numero de salón asígnado al profesor de teoría
 * @param numEmpleado es heredado de la clase Profesor
 * @param sueldo es heredado de la clase Profesor
 * @param nombre es heredado de la clase Persona
 * @param edad es heredado de la clase Persona
 * @param genero es heredado de la clase Persona
**/
    public ProfesorTeoria(String numSalon, int numEmpleado, float sueldo, 
            String nombre, int edad, String genero) {
        super(numEmpleado, sueldo, nombre, edad, genero);
        this.numSalon = numSalon;
    }

    public ProfesorTeoria(String numSalon, int numEmpleado, float sueldo) {
        super(numEmpleado, sueldo);
        this.numSalon = numSalon;
    }

    public ProfesorTeoria(String numSalon) {
        this.numSalon = numSalon;
    }
    
    public String getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(String numSalon) {
        this.numSalon = numSalon;
    }
    
    public void usoTraje(){
        System.out.println("Estoy usando un traje");
    }
    
    @Override
    public String toString() {
        return super.toString()+
                ", ProfesorTeoria{" + "numSalon=" + numSalon + '}';
    }
    
}
