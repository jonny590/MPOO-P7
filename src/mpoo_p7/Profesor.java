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
public class Profesor extends Persona{
    private int numEmpleado;
    private float sueldo;

    public Profesor() {
    }
/**
 * @param sueldo es el sueldo que gana el profesor
 * @param numEmpleado es el numero de empleado del profesor
 * @param nombre heredado de la clase Persona
 * @param edad heredado de la clase Persona
 * @param genero heredado de la clase Persona
**/
    public Profesor(int numEmpleado, float sueldo, String nombre, int edad,
            String genero) {
        super(nombre, edad, genero);
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public Profesor(int numEmpleado, float sueldo) {
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void calificar(){
        System.out.println("Calificando tareas");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Profesor{" + "numEmpleado=" + numEmpleado + ", sueldo=" + 
                sueldo + '}';
    }
}
