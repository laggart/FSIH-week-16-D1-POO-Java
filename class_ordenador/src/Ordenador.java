public class Ordenador {
    private String marca;
    private String modelo;
    private double RAM;
    private int HDD;
    private double precio;

    public Ordenador(String marca, String modelo, double RAM, int HDD, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.HDD = HDD;
        this.precio = precio;
    }

// Getters 
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getRAM() {
        return this.RAM;
    }

    public int getHDD() {
        return this.HDD;
    }

    public double getPrecio() {
        return this.precio;
    }

// Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRAM(double RAM){
        this.RAM = RAM;
    }

    public void setHDD(int HDD){
        this.HDD = HDD;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " el Ordenador elegido, es: " + getMarca() + ", modelo: " + getModelo() + " que cuenta con: " + getRAM() + " Gigas de memoria RAM," + getHDD() + " TB de HDD y tiene un costo de: " + getPrecio() + "euros.";
    }

}