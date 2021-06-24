package mpoo_p4;

public class Coche {
    private String color;
    private String modelo;
    private String marca;
    private int numPuertas;
    private Persona piloto;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    public Coche() {
    }

    public Coche(String color, String modelo, String marca, int numPuertas) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.numPuertas = numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Persona getPiloto() {
        return piloto;
    }

    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public String toString2(){
        return "Coche: {Color: "+this.color+", Modelo: "+this.modelo+", Marca: "
               +this.marca+", Puertas: "+this.numPuertas;
    }
    @Override
    public String toString() {
        return "Yo soy " + piloto.toString() + " y soy el piloto"+
                "\nYo soy " + copiloto.toString() + " y soy el copiloto"+
                "\nYo soy " + pasajero1.toString() + " y soy el pasajero 1"+
                "\nYo soy " + pasajero2.toString() + " y soy el pasajero 2";
    }
}
