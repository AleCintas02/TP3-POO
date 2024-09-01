import java.util.*;
public class Empresa
{
     public static void main(String []args){
         Calendar fechaIngreso = new GregorianCalendar(2024, Calendar.SEPTEMBER, 02);
         Empleado E1 = new Empleado(20445420205L, "Cintas", "Alejandro", 50000.0, fechaIngreso);
         System.out.println(E1.esAniversario());
    }
}
