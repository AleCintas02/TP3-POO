import java.util.Scanner;

public class GestionStockMenu {
    public static void main(String[] args) {
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11-4239-8447", 2, 100);
        Producto p1 = new Producto(1, "Perfumería", "Jabón Deluxe", 5.25, 500, 15.0, 10, lab1);
        p1.mostrar();
        System.out.println(p1.mostrarLinea());

        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle para mostrar el menú y ajustar el stock
        do {
            System.out.println("\nMenú de Ajuste de Stock:");
            System.out.println("1. Agregar o disminuir stock");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número positivo para agregar o negativo para disminuir el stock: ");
                    int cantidad = scanner.nextInt();
                    p1.ajuste(cantidad);
                    System.out.println("Stock ajustado.");
                    p1.mostrar();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
