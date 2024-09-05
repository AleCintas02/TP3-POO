/**
 * Esta clase ejecutable permite interactuar con una cuenta corriente y caja de ahorro de una persona.
 * Tambien permite realizar operaciones como depósitos, extracciones y 
 * mostrar información de las cuentas bancaria.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Banco
{
    public static void main(String []args){
        Persona P1 = new Persona(44542020, "Juán", "Pérez", 2002);
        /*CajaDeAhorro Caja1 = new CajaDeAhorro(1, P1, 3500.0);
        Caja1.mostrar();
        Caja1.extraer(300.0);
        Caja1.mostrar();
        Caja1.depositar(1000.0);
        Caja1.mostrar();
        Caja1.extraer(100.0);
        Caja1.mostrar();*/
        CuentaCorriente Cuenta1 = new CuentaCorriente(1,P1, 3500.0);
        Cuenta1.mostrar();
        Cuenta1.extraer(4500.0);
        Cuenta1.mostrar();
    }
}
