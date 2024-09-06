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
        Mujer Mujer1 = new Mujer("María", "Gómez", 28);
        Hombre Hombre1 = new Hombre("Pedro", "Leyes", 29);
       
        System.out.println(Mujer1.datos());
        System.out.println(Hombre1.datos());
       
        Mujer1.casadaCon();
        Hombre1.casadoCon();
       
        Mujer1.casarseCon(Hombre1);
        
        Mujer1.casadaCon();
        Hombre1.casadoCon();
        
        System.out.println("\nDivorcio");
        Mujer1.divorcio();
        
        Mujer1.casadaCon();
        Hombre1.casadoCon();
        
        
       
   }
}
