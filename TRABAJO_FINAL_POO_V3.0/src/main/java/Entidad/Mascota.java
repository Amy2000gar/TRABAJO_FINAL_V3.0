package Entidad;

public class Mascota extends Cliente
{
    //ATRIBUTOS
    private String raza,color,tamaño;
    private String peso;
    //CONSTRUCTORES
    public Mascota(String raza, String color, String tamaño, String peso) {
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public Mascota(String nombres,String DNI,String raza, String color, String tamaño, String peso) {
        super(nombres, DNI);
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }
    

    //METODOS GETTER & SETTER
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
}
