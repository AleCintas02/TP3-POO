/**
 * La clase RegistroCivil simula el registro civil para mostrar información sobre personas y su estado civil.
 * Crea instancias de `Mujer` y `Hombre`, y demuestra el cambio en el estado civil tras un matrimonio.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class RegistroCivil
{
   public static void main(String []args){
       Mujer M1 = new Mujer("María", "Gómez", 28);
       Hombre H1 = new Hombre("Pedro", "Leyes", 29);
       System.out.println(M1.datos());
       System.out.println(H1.datos());
       M1.mostrarEstadoCivil();
       H1.casarseCon(M1);
       M1.mostrarEstadoCivil();
       H1.mostrarEstadoCivil();
   }
}
