package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);//Importamos la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bloetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP, tecladoHP, ratonHP);
        
        
        //Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer); 
        orden1.mostrarOrden();
    }
}
