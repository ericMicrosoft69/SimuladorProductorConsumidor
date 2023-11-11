package consumidores;

import almacen.Almacen;

public class Consumidor extends Almacen implements Runnable{
    public String nombre;

    public Consumidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int contador= 0;
        Consumidor consumidor = new Consumidor("Consumidor: "+contador);
        try {
            consumidor.consumir();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
