/**
 * Esta clase representa un programa que permite realizar operaciones con objetos Punto.
 * Los puntos son creados a partir de las coordenadas ingresadas en la línea de comandos.
 * El programa ofrece un menú de opciones para operar con los puntos.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */

public class CrearPunto
{
    public static void main(String [] args){
        Punto p1 = new Punto(7.5, 0.5);
        Punto p2 = new Punto(6.5, 3.5);
        
        System.out.println("d= " + p1.distanciaA(p2));
    }
}
