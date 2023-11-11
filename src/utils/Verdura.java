package utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Verdura {
    public int tiempoCrecimiento;
    public String nombres[]= {"lettuce", " cabbage", " onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", " eggplant", " carrot", "green bean"};

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public int getTiempoCrecimiento() {
        int numeroAleatorio= (int) (Math.floor(Math.random() * (10-1+1)) + 1);
        return numeroAleatorio;
    }

    public String getNombre() {
        int posicionAleatoria = numeroAleatorioEnRango(0, nombres.length - 1);
        return nombres[posicionAleatoria];
    }
}
