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
public class ProfesorLaboratorio extends Profesor{
    private String numLaboratorio;

    public ProfesorLaboratorio() {
    }
/**
 * @param numLaboratorio es el numero de laboratorio asígnado al profesor
 * @param numEmpleado es heredado de la clase Profesor
 * @param sueldo es heredado de la clase Profesor
 * @param nombre es heredado de la clase Persona
 * @param edad es heredado de la clase Persona
 * @param genero es heredado de la clase Persona
**/
    public ProfesorLaboratorio(String numLaboratorio, int numEmpleado, 
            float sueldo, String nombre, int edad, String genero) {
        super(numEmpleado, sueldo, nombre, edad, genero);
        this.numLaboratorio = numLaboratorio;
    }

    public ProfesorLaboratorio(String numLaboratorio, int numEmpleado, 
            float sueldo) {
        super(numEmpleado, sueldo);
        this.numLaboratorio = numLaboratorio;
    }

    public ProfesorLaboratorio(String numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }

    public String getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(String numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }
    
    public void usoBata(){
        System.out.println("Estoy usando una bata de laboratorio");
    }

    @Override
    public String toString() {
        return super.toString()+
            ", ProfesorLaboratorio{" + "numLaboratorio=" + numLaboratorio + '}';
    }
}
