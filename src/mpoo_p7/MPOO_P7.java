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
public class MPOO_P7 {

    /**
     * @param args son los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger1 = new Gerente();
        ger1.setNombre("Raul");
        ger1.setNumEmpleado(111);
        ger1.setSueldo(15000);
        System.out.println(ger1);
        ger1.setPresupuesto(100000);
        System.out.println(ger1);
        
        System.out.println("\n##############");
        Gerente ger2 = new Gerente(500000,"Julieta", 15, 30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        
        System.out.println("\n##############");
        Gerente ger3 = new Gerente();
        if (ger3 instanceof Gerente)
            System.out.println("Es una instancia de Gerente");
        
        if (ger3 instanceof Empleado){
            System.out.println("Sí es una instancia de Empleado");
        }else{
            System.out.println("No es instancia de Empleado");
        }if(ger3 instanceof Object){
            System.out.println("Si es una instancia de Object");
        }else{
            System.out.println("No es instancia de Object");
        }

        System.out.println("\n******* Actividad Extra *******");
        AlumnoIngenieria alumno1 = new AlumnoIngenieria("Circuito 1", 317049325,
                true, "Jonathan", 20, "Masculino");
        AlumnoMedicina alumno2 = new AlumnoMedicina("Vendaje", 317048291, true, 
                "Monica", 20, "Femenino");
        ProfesorLaboratorio profesor1 = new ProfesorLaboratorio("A-201", 56, 4920, 
            "Francisco", 40, "Masculino");
        ProfesorTeoria profesor2 = new ProfesorTeoria("B-101", 72, 3500, "María",
                45, "Femenino");
        
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(profesor1.toString());
        System.out.println(profesor2.toString());
        profesor1.calificar();
    }
    
}
