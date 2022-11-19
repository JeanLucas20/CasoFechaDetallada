package modelo;

public class FechaDetallada extends Fecha{

    public FechaDetallada(int dia, int mes, int año) {
    super(dia, mes, año);
    }
    public int getFecha(){
        if(getMes()==11){

            mes= 2;
        }    
        return super.getMes();
    }

}




