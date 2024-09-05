import java.util.*;
/**
 * La clase CartaPersona contiene el método principal para ejecutar una prueba de la clase Persona.
 * Crea una instancia de Persona, verifica si es su cumpleaños y muestra un mensaje en consecuencia.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class CartaPersona
{
    public static void main(String []args){
        Calendar fechaNacimiento = new GregorianCalendar(1990, Calendar.AUGUST, 20);
        
        Persona persona = new Persona(12345678, "Juan", "Pérez", fechaNacimiento);
        if (persona.esCumpleanos()) {
            System.out.println("¡Feliz cumpleaños, " + persona.getNombre() + "!");
        } else {
            System.out.println("Hoy no es el cumpleaños de " + persona.getNombre() + ".");
        }

    }
}
