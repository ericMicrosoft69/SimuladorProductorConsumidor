package utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Verdura {
    public int tiempoCrecimientoMaximo = 5000;
    public String nombres[]= {"lettuce", " cabbage", " onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", " eggplant", " carrot", "green bean"};

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public int getTiempoCrecimiento() {
        return (int) (Math.floor(Math.random() * this.tiempoCrecimientoMaximo) + 1);
    }

    public String getNombre() {
        int posicionAleatoria = numeroAleatorioEnRango(0, nombres.length - 1);
        return nombres[posicionAleatoria];
    }
}
