/**
 * La clase GestionHospital es el punto de entrada para la gestión de datos en un hospital.
 * Crea un hospital, localidades y pacientes, y muestra los datos filiatorios de un paciente.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class GestionHospital
{
    public static void main(String [] args)
    {
        Hospital H1 = new Hospital("Garrahan", " Leonardo Ruiz");
        Localidad L1 = new Localidad("Monte Caseros", "Corrientes");
        Localidad L2 = new Localidad("Goya", "Corrientes");
        Paciente P1 = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril", L1, L2);
        H1.consultaDatosFiliatorios(P1);
    }
}
