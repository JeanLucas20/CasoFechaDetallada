package modelo;

public class Fecha{
    // -----------------
    // Atributos
    // -----------------
    public int dia;
    public int mes;
    public int año;

    // -----------------
    // Métodos
    // ----------------
//  Constructor sin parametros
public Fecha()
{
    this.dia = 0;
    this.mes = 0;
    this.año = 0;
}

// Constructor con parametro string

// Constructor con 3 parametro
public Fecha (int d, int m, int a){

    this.dia = d;
    this.mes = m;
    this.año = a;
}   

    // Métodos de acceso (setter and getter)
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return año;
    }
    public void setYear(int year) {
        this.año = year;
    }

    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (año==otra.año);
    }
}