
public class Secretaria
{
    
    public static void main(String [] args){
        Docente D1 = new Docente("Elisa Sánchez", "Tercero", 1600.0);
        Escuela E1 = new Escuela("Manuel Belgrano", "Irigoyen 1580", " Leopoldo Juez");
        E1.imprimirRecibo(D1);
    }
}
