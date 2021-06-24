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
public class AlumnoMedicina extends Alumno{
    private String instrumento;

    public AlumnoMedicina() {
    }
/**
 * @param instrumento es el nombre del instrumento que está usando el alumno
**/
    public AlumnoMedicina(String instrumento) {
        this.instrumento = instrumento;
    }

    public AlumnoMedicina(String instrumento, int numCuenta, boolean tieneBeca, 
            String nombre, int edad, String genero){
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.instrumento = instrumento;
    }

    public AlumnoMedicina(String instrumento, int numCuenta, boolean tieneBeca){
        super(numCuenta, tieneBeca);
        this.instrumento = instrumento;
    }
    
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void curar(){
        System.out.println("Estoy curando a una persona");
    }
    
    @Override
    public String toString() {
        return super.toString()+
                ", AlumnoMedicina{" + "instrumento=" + instrumento + '}';
    }
}
