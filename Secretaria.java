/**
 * Clase que representa una Secretaria que se utiliza para ejecutar un programa que crea un objeto
 * de la clase `Docente` y un objeto de la clase `Escuela`, y luego imprime un recibo para el docente.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Secretaria
{
    
    public static void main(String [] args){
        Docente D1 = new Docente("Elisa Sánchez", "Tercero", 1600.0);
        Escuela E1 = new Escuela("Manuel Belgrano", "Irigoyen 1580", " Leopoldo Juez");
        E1.imprimirRecibo(D1);
    }
}
