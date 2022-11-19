package ejecutable;

import java.util.Scanner;
import modelo.FechaDetallada;


public class test {
    public static void main(String[] args) {

        
        Scanner Leer=new Scanner(System.in);
        int dia,mes,año,D,M,A;
        System.out.println("Ingrese Dia:");
        dia=Leer.nextInt();
        System.out.println("Ingresar Mes:");
        mes=Leer.nextInt();
        System.out.println("Ingresar Año:");
        año=Leer.nextInt();

        
        FechaDetallada OP=new FechaDetallada(dia,mes,año);
        D= OP.getDia();
        M= OP.getMes();
        A= OP.getYear();

        System.out.println("Día: "+ D);
        System.out.println("Mes: "+ M);
        System.out.println("Año: "+ A);
        
        // if ((f.equals(f))==(f2.equals(f2))){
        //System.out.println("No son Iguales las fechas");
        //}

        //else{
            //System.out.println("Son Iguales las fechas");
        }
}




