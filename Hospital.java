import java.util.*;

/**
 * La clase Hospital representa un hospital con su nombre y el nombre del director.
 * Proporciona métodos para consultar datos filiatorios de un paciente.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
   
    /**
     * Constructor para objetos de la clase Hospital.
     * 
     * @param p_hospital  Nombre del hospital.
     * @param p_director  Nombre del director del hospital.
     */
    public Hospital(String p_hospital, String p_director)
    {
       this.setHospital(p_hospital);
       this.setDirector(p_director);
    }
    
    private void setHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    /**
     * Obtiene el nombre del hospital.
     * 
     * @return Nombre del hospital.
     */
    public String getHospital(){
        return this.nombreHospital;
    }
    
    /**
     * Obtiene el nombre del director del hospital.
     * 
     * @return Nombre del director.
     */
    public String getDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Muestra los datos filiatorios de un paciente.
     * 
     * @param p_paciente  Paciente del cual se consultarán los datos filiatorios.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        System.out.println("Hospital: " + this.getHospital() + "\tDirector: " + this.getDirector());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + " \tHistoria clínica: " + p_paciente.getHistoria() + " \tDomicilio: " + p_paciente.getDomicilio());
        System.out.println("Localidad: " + p_paciente.getVive().getNombre() + " \tProvincia: " + p_paciente.getVive().getProvincia());
    }
}
