import almacen.Almacen;
import consumidores.Consumidor;
import granjeros.Granjero;
import utils.Verdura;

import static almacen.Almacen.listaVerduras;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Almacen almacen = new Almacen();
        Granjero granjero = new Granjero("Granjero", almacen);
        Consumidor consumidor = new Consumidor("Consumidor");
        granjero.run();
        granjero.run();
        System.out.println(listaVerduras);
        consumidor.run();
        System.out.println(listaVerduras);


    }
}