# SimuladorProductorConsumidor
Descripción del Proyecto

Este proyecto simula un sistema simple de producción y consumo de verduras, con la participación de un almacén, un granjero y un consumidor. El granjero cultiva verduras y las almacena en un almacén compartido. Mientras tanto, el consumidor retira las verduras del almacén para su consumo.
Estructura del Proyecto

El proyecto consta de las siguientes clases:

    Main: Clase principal que contiene el método main. Inicializa una instancia de Almacen, Granjero y Consumidor, y luego ejecuta el cultivo de verduras por parte del granjero y el consumo por parte del consumidor.

    Almacen: Representa el almacén de verduras. Contiene una lista compartida de verduras (listaVerduras) que el granjero puede cultivar y el consumidor puede consumir.

    Granjero: Representa al granjero. Cultiva verduras y las almacena en el almacén compartido.

    Consumidor: Representa al consumidor. Consume verduras del almacén compartido.

    Verdura: Clase que modela una verdura.