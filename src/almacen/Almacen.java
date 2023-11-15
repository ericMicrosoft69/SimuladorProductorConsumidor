package almacen;

import utils.Verdura;

import java.util.ArrayList;

public class Almacen {
    private static int capacidad;
    public static ArrayList<String> listaVerduras = new ArrayList<>();

    public synchronized void almacenarVerdura( String nombreVerdura, int tiempoCercimiento) throws InterruptedException {

           while (capacidad == 30) {
               System.out.println("El almacen está lleno para " );
               wait();
           }

            listaVerduras.add(nombreVerdura);
            capacidad++;
            notifyAll();


    }

    public static void consumir() throws InterruptedException {
        synchronized (listaVerduras) {
            int contador = 0;
            listaVerduras.remove(contador);
            contador++;
            capacidad--;
            if (capacidad == 0) {
                System.out.println("El almacen está vacío");
                listaVerduras.wait();
            }
        }
    }
}
