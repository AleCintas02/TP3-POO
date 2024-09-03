import java.util.*;
public class CrearPersona
{
   public static void main(String[]args){
        Calendar fechaNacimiento = new GregorianCalendar(2002, Calendar.OCTOBER, 19);
       Persona p1 = new Persona(123132, "ASD", "ASD", fechaNacimiento);
       p1.mostrar();
       Persona p2 = new Persona(123132, "ASD2", "ASD2", 2002);
       p2
       .mostrar();
       
   }
}
