

public class CrearPunto
{
    public static void main(String [] args){
        Punto p1 = new Punto(7.5, 0.5);
        Punto p2 = new Punto(6.5, 3.5);
        
        System.out.println("d= " + p1.distanciaA(p2));
    }
}
