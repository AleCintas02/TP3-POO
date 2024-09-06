import java.util.*;

/**
 * La clase Empresa contiene el método principal para ejecutar un programa de ejemplo que crea instancias de `Empleado` y `EmpleadoConJefe`.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Empresa
{
     public static void main(String []args){
         Calendar fechaIngreso = new GregorianCalendar(2022, Calendar.SEPTEMBER, 06);
         Empleado E1 = new Empleado(20445420205L, "Jorge", "Perez", 50000.0, fechaIngreso);
         E1.mostrar();
         System.out.println(E1.esAniversario() ? "\nPermiso de salida!" : "\nNo es aniversario");
         
         Calendar fechaIngreso2 = new GregorianCalendar(2023, Calendar.SEPTEMBER, 02);
         EmpleadoConJefe Jefe = new EmpleadoConJefe(20445420205L, "Cintas", "Alejandro", 50000.0, fechaIngreso2);
         Jefe.mostrar();
         Calendar fechaIngreso3 = new GregorianCalendar(2014, Calendar.SEPTEMBER, 02);
         EmpleadoConJefe Empleado1 = new EmpleadoConJefe(20445420205L, "Gonzales", "Julian", 20000.0, fechaIngreso3, Jefe);
         Empleado1.mostrar();
         
    }
}
