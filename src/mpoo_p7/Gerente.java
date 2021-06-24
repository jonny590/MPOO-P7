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
public class Gerente extends Empleado{
    private float presupuesto;

    public Gerente() {
    }
/**
 * @param nombre es heredado de la clase Empleado
 * @param numEmpleado es heredado de la clase Empleado
 * @param sueldo es heredado de la clase Empleado
**/
    public Gerente(String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
    }

    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public Gerente(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(float presupuesto){
        setPresupuesto(presupuesto);
    }

    @Override
    public String toString() {
        return super.toString()+
                " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
}
