/**
 * La clase Escuela representa una institución educativa con nombre, domicilio y director.
 * Proporciona métodos para establecer y obtener estos atributos, así como para imprimir un recibo con información de un docente.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Escuela
{
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Constructor para objetos de la clase Escuela.
     * 
     * @param p_nombre Nombre de la escuela.
     * @param p_domicilio Domicilio de la escuela.
     * @param p_director Director de la escuela.
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    /**
     * Establece el nombre de la escuela.
     * 
     * @param p_nombre Nombre de la escuela.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el domicilio de la escuela.
     * 
     * @param p_domicilio Domicilio de la escuela.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Establece el director de la escuela.
     * 
     * @param p_director Director de la escuela.
     */
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    /**
     * Obtiene el nombre de la escuela.
     * 
     * @return Nombre de la escuela.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el domicilio de la escuela.
     * 
     * @return Domicilio de la escuela.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Obtiene el director de la escuela.
     * 
     * @return Director de la escuela.
     */
    public String getDirector(){
        return this.director;
    }
    
    /**
     * Imprime un recibo con la información de la escuela y del docente proporcionado.
     * 
     * @param p_docente Docente del cual se imprimirá la información.
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + "\tDomicilio: "+ this.getDomicilio() + "\tDirector: "+ this.getDirector());
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.println("Sueldo: " + p_docente.calcularSueldo());
        System.out.println("Sueldo básico: " + p_docente.getSueldoBasico());
        System.out.println("Asignación familiar: " + p_docente.getAsignacionFamiliar());
    }
}
