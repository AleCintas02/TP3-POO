/**
 * Esta clase ejecutable contiene el método principal para la gestión del stock 
 * de productos en un laboratorio. En este ejemplo, se crean instancias de la clase 
 * Laboratorio y  Producto, y se muestran sus detalles.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro 
 */
public class GestionStock
{
   public static void main(String[] args) {
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11-4239-8447", 2, 100);
        Producto p1 = new Producto(1, "Medicamentos", "Tribiocort", 7000, 500, 40.0, 10, lab1);
        p1.mostrar();
        p1.ajuste(-200);
        p1.mostrar();
        System.out.println(p1.mostrarLinea());
        //hola
    }
}
