
public class RegistroCivil
{
   public static void main(String []args){
       Mujer M1 = new Mujer("María", "Gómez", 28);
       Hombre H1 = new Hombre("Pedro", "Leyes", 29);
       System.out.println(M1.datos());
       System.out.println(H1.datos());
       M1.mostrarEstadoCivil();
       H1.mostrarEstadoCivil();
       M1.casarseCon(H1);
       M1.casadaCon();
       H1.casadoCon();
   }
}
