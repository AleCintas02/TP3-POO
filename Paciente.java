import java.util.*;

/**
 * La clase Paciente representa a un paciente con su información médica y personal.
 * Incluye datos como el número de historia clínica, nombre, domicilio y localidades de nacimiento y residencia.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructor para objetos de la clase Paciente.
     * 
     * @param p_historia       Número de historia clínica del paciente.
     * @param p_nombre         Nombre del paciente.
     * @param p_domicilio      Domicilio del paciente.
     * @param p_localidadNacido  Localidad de nacimiento del paciente.
     * @param p_localidadVive  Localidad de residencia del paciente.
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }

    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    
    private void setVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
    /**
     * Obtiene el número de historia clínica del paciente.
     * 
     * @return Número de historia clínica.
     */
    public int getHistoria(){
        return this.historiaClinica;
    }
    
    /**
     * Obtiene el nombre del paciente.
     * 
     * @return Nombre del paciente.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el domicilio del paciente.
     * 
     * @return Domicilio del paciente.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Obtiene la localidad donde el paciente vive.
     * 
     * @return Localidad de residencia del paciente.
     */
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    /**
     * Obtiene la localidad donde el paciente nació.
     * 
     * @return Localidad de nacimiento del paciente.
     */
    public Localidad getNacido(){
        return this.localidadNacido;
    }
}
