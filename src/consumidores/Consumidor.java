package consumidores;

import almacen.Almacen;

public class Consumidor extends Almacen implements Runnable{
    public String nombre;

    public Consumidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {


        try {
            consumir();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
