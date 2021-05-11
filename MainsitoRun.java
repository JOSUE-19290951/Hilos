package hilosjava;

/*
PROGRAMADOR: JOSUE DANIEL TORRES SANTOS
TOPICOS AVANZADOS DE PROGRAMACION
ARELI PEREZ APARICIO

Implemente un programa en java que utilice hilos. El 
tamaño del vector es desde el main como parámetro. El 
llenado del vector es aleatorio. El hilo muestra la suma 
de los elementos de un vector, la suma de los cuadrados 
de los elementos del vector y la media. Cree dos 
instancias con diferente tamaño de vector y presente los 
resultados.
*/
import java.util.Scanner;

public class MainsitoRun {

    public static void main(String[] args) {
        Arrays uno, dos;
        Scanner gg = new Scanner(System.in);

        System.out.println("=============HILOS EN JAVA===========");
        System.out.println("Deme el valor de tamaño de un vector: ");
        int tamVec = gg.nextInt();
        System.out.println("Deme el tamaño de otro vector: ");
        int lonVec = gg.nextInt();

        uno = new Arrays("Hilo vector uno", tamVec); //instanciamos el primer arreglo
        dos = new Arrays("Hilo vector dos", lonVec); //instanciamos el segundo arreglo

        uno.start(); //iniciamos el primer hilo
        dos.start(); //iniciamos el segundo hilo

        try {
            uno.join(); //hacemos el uso del join para la union de los hilo
            dos.join(); 
        } catch (InterruptedException e) {
        }
        //impresion de los resultados 
        System.out.println("Suma del primer vector: " + uno.getSuma());
        System.out.println("Suma del segundo Vector: " + dos.getSuma());
        System.out.println("Suma de cuadrados de vector uno: " + uno.getSumaCuadrados());
        System.out.println("Suma de cuadrados de vector dos: " + dos.getSumaCuadrados());
        System.out.println("Media vector uno: " + uno.getMedia());
        System.out.println("Media del vector dos: " + dos.getMedia());

    }
}
