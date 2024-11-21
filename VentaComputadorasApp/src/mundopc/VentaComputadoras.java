package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadoras {
    public static void main(String[] args) {

        //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27 );
        //System.out.println(monitorLenovo);
        // Creamos un objeto de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        //otra
        Monitor monitorKalley = new Monitor("Kalley", 27);
        Teclado tecladoKalley = new Teclado("USB", "Kalley" );
        Raton ratonKalley = new Raton("USB","Kalley");
        Computadora computadoraKalley = new Computadora("Computadora Kalley-AMD",
                monitorKalley, tecladoKalley, ratonKalley);

        //crear una orden

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraKalley);
        orden1.mostrarOrden();

        // Computadora Intell
        Monitor monitorHp = new Monitor("hp", 27);
        Teclado tecladoNFT = new Teclado("Bluetooth","NFT");
        Raton ratonNFT = new Raton("USB", "NFT");
        Computadora pcGamerIntell = new Computadora("GamerIntell", monitorHp,
                tecladoNFT, ratonNFT);

        //new order

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraKalley);
        orden2.agregarComputadora(pcGamerIntell);
        System.out.println();
        orden2.mostrarOrden();
    }
}