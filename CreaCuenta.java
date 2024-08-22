
public class CreaCuenta
{
   public static void main(String [] args){
       Persona P1 = new Persona(44542020, "Alejandro", "Cintas", 2002);
       CuentaBancaria C1 = new CuentaBancaria(1, P1, 30000.0);
       C1.mostrar();
       System.out.println(C1.toStrinf());
       
   }
}
