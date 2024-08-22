import java.util.Random;

public class CreaFigura {
    public static void main(String[] args) {
        // Primer círculo
        System.out.println("-> Círculo 1");
        Random random1 = new Random();
        double radio1 = random1.nextDouble() * 100.0;
        Punto punto1 = new Punto(0.0, 0.0);
        Circulo circulo1 = new Circulo(radio1, punto1);
        circulo1.mostrar();
        circulo1.desplazar(-240, -230);
        System.out.println("\nCírculo 1 DESPLAZADO:");
        circulo1.mostrar();
        
        // Segundo círculo
        System.out.println("\n-> Círculo 2");
        Random random2 = new Random();
        double radio2 = random2.nextDouble() * 100.0;
        Punto punto2 = new Punto(5.2, 0.5);
        Circulo circulo2 = new Circulo(radio2, punto2);
        circulo2.mostrar();
        
        // Comparar círculos
        System.out.println("\n-> Comparación de círculos");
        Circulo mayorCirculo = circulo1.elMayor(circulo2);
        System.out.println("Mayor círculo: ");
        mayorCirculo.mostrar();
        System.out.println("Distancia entre círculos: " + circulo1.distanciaA(circulo2));
        
        // Primer rectángulo
        System.out.println("\n-> Rectángulo 1");
        Punto punto3 = new Punto(0.0, 0.0);
        Rectangulo rectangulo1 = new Rectangulo(punto3, 100.0, 200.0);
        rectangulo1.mostrar();
        
        // Segundo rectángulo
        System.out.println("\n-> Rectángulo 2");
        Punto punto4 = new Punto(2.2, 4.0);
        Rectangulo rectangulo2 = new Rectangulo(punto4, 200.0, 300.0);
        rectangulo2.mostrar();
        
        // Comparar rectángulos
        System.out.println("\n-> Comparación de rectángulos");
        System.out.println("Distancia entre rectángulos: " + rectangulo1.distanciaA(rectangulo2));
        Rectangulo mayorRectangulo1 = rectangulo1.elMayor(rectangulo2);
        System.out.println("Mayor rectángulo: ");
        mayorRectangulo1.mostrar();
        
        // Otro conjunto de rectángulos
        System.out.println("\n-> Nuevo Rectángulo 1");
        Random random3 = new Random();
        double ancho1 = random3.nextDouble() * 100.0;
        double alto1 = random3.nextDouble() * 100.0;
        Rectangulo rectangulo3 = new Rectangulo(ancho1, alto1);
        rectangulo3.mostrar();
        rectangulo3.desplazar(40.0, -20.0);
        System.out.println("Nuevo Rectángulo 1 DESPLAZADO:");
        rectangulo3.mostrar();
        
        System.out.println("\n-> Nuevo Rectángulo 2");
        Random random4 = new Random();
        double ancho2 = random4.nextDouble() * 100.0;
        double alto2 = random4.nextDouble() * 100.0;
        Punto punto5 = new Punto(7.4, 4.5);
        Rectangulo rectangulo4 = new Rectangulo(punto5, ancho2, alto2);
        rectangulo4.mostrar();
        
        // Comparar nuevos rectángulos
        System.out.println("\n-> Comparación de nuevos rectángulos");
        Rectangulo mayorRectangulo2 = rectangulo3.elMayor(rectangulo4);
        System.out.println("Mayor rectángulo: ");
        mayorRectangulo2.mostrar();
        System.out.println("Distancia entre rectángulos: " + rectangulo3.distanciaA(rectangulo4));
    }
}
