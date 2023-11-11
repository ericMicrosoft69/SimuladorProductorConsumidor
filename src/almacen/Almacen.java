package almacen;

import utils.Verdura;

import java.util.ArrayList;

public class Almacen extends Verdura {
    static int capacidad ;

    public static  ArrayList listaVerduras ;


    public  static void producir() throws InterruptedException {
        Verdura verdura = new Verdura();
        listaVerduras.add(verdura.getNombre());
        capacidad++;
        if(capacidad==30){
            System.out.println("El almacen está lleno");
        listaVerduras.notifyAll();
        }
    }

    public  static void consumir() throws InterruptedException {

            int contador=0;
            listaVerduras.remove(contador);
            contador++;
            capacidad--;
            if (capacidad==0){
                System.out.println("El almacen está Vacion");
                listaVerduras.wait();
            }

    }

}
