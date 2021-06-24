package mpoo_p4;

public class MPOO_P4 {
/**
 * *@author Alonso Salinas
 * @version 1.3 21.06.2021
 * @param args argumentos para el método main
 */
    public static void main(String[] args) {
        System.out.println("/*******Práctica 4*******/");
        System.out.println("/*******Clase Punto*******/");
        Punto punto = new Punto();
        punto.imprimePunto();
        punto.x = 5;
        punto.y = 6;
        punto.imprimePunto();
        
        Punto punto2 = new Punto(8,17);
        punto2.imprimePunto();
        
        System.out.println("\n/*******Clase Coche*******/");
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString2());
        miCoche.setColor("rojo");
        miCoche.setModelo("jetta");
        miCoche.setMarca("VW");
        miCoche.setNumPuertas(4);
        System.out.println(miCoche.toString2());
        
        Coche tuCoche = new Coche("negro", "Fiesta", "Ford", 5);
        System.out.println(tuCoche.toString2());
        
        System.out.println("\n/*******Clase Perro*******/");
        Perro miPerro = new Perro("Ganjah", "Labrador", "Amarillo");
        System.out.println(miPerro.toString());
        System.out.println(miPerro);
        
        System.out.println("/********Práctica 5*******/");
        System.out.println("/********Clase Circulo*******/");
        Circulo cir1 = new Circulo();
        System.out.println(cir1);
        cir1.setRadio(5);
        System.out.println(cir1);
        System.out.println("Perimetro = "+ cir1.perimetro());
        System.out.println("Área = "+ cir1.area());
        
        Circulo cir2 = new Circulo();
        cir2.setRadio(-10);
        System.out.println(cir2);
        System.out.println("Perimetro = "+ cir2.perimetro());
        
        System.out.println("\n/********Clase Persona*******/");
        Persona per1 = new Persona();
        per1.setNombre("Jonathan");
        per1.setApellido("Alonso");
        
        Fecha nac = new Fecha();
        nac.setDia(10);
        nac.setMes(6);
        nac.setAnio(1999);
        per1.setfNacimiento(nac);
        
        System.out.println(per1);
        System.out.println("/*******Actividad Extra*******/");
        Persona persona1 = new Persona("Christian", "Alonso");
        Persona persona2 = new Persona("Juan", "Alonso");
        Persona persona3 = new Persona("Jonathan", "Alonso");
        Persona persona4 = new Persona("Katia", "Lizeth");
        Coche miCoche2 = new Coche();
        miCoche2.setPiloto(persona1);
        miCoche2.setCopiloto(persona2);
        miCoche2.setPasajero1(persona3);
        miCoche2.setPasajero2(persona4);
        System.out.println(miCoche2);
    }
}
