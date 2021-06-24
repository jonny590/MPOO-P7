/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p7;

/**
 * @author Alonso Salinas
 */
public class Alumno extends Persona{
    private int numCuenta;
    private boolean tieneBeca;

    public Alumno() {
    }
/**
 * @param numCuenta es el numero de cuenta del alumno
 * @param tieneBeca es para saber si tiene beca
 * @param nombre heredado de la clase Persona
 * @param edad heredado de la clase Persona
 * @param genero heredado de la clase Persona
 */
    public Alumno(int numCuenta, boolean tieneBeca, String nombre, int edad, 
            String genero) {
        super(nombre, edad, genero);
        this.numCuenta = numCuenta;
        this.tieneBeca = tieneBeca;
    }
    
    public Alumno(int numCuenta, boolean tieneBeca) {
        this.numCuenta = numCuenta;
        this.tieneBeca = tieneBeca;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }

    public void estudiar(){
        System.out.println("Estoy estudiando");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Alumno{" + "numCuenta=" + numCuenta + ", tieneBeca=" + 
                tieneBeca + '}';
    }
}
