package granjeros;

import almacen.Almacen;

public class Granjero extends Almacen implements Runnable {
    public static final int duration = 1000;
    private final String identificador ;


    public Granjero (String identificador){
        super();
        this.identificador  = identificador;
    }

    @Override
    public void run() {

        try {
            producir();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
