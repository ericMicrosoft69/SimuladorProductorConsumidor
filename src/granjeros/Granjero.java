package granjeros;

import almacen.Almacen;
import utils.Verdura;

public class Granjero extends Almacen implements Runnable {
    public static final int duration = 1000;
    private final String identificador ;
    private Almacen almacen;


    public Granjero (String identificador, Almacen almacen){
        super();
        this.identificador  = identificador;
        this.almacen = almacen;
    }

    @Override
    public void run() {

        try {
            Verdura verdura = new Verdura();
            Thread.sleep(verdura.getTiempoCrecimiento());
            almacenarVerdura( verdura.getNombre(), verdura.getTiempoCrecimiento());



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
