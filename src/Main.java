import consumidores.Consumidor;
import granjeros.Granjero;
import utils.Verdura;

import static almacen.Almacen.listaVerduras;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int contador = 0;
        Granjero granjero = new Granjero("Granjero"+contador);
        Consumidor consumidor = new Consumidor("Consumidor" +contador);
        granjero.run();
        granjero.run();
        System.out.println(listaVerduras);
        consumidor.run();
        System.out.println(listaVerduras);


    }
}