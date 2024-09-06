/**
 * La clase Mujer representa a una mujer con atributos como nombre, apellido, edad, estado civil y esposo.
 * Proporciona métodos para establecer y obtener estos atributos, así como para realizar acciones relacionadas con el estado civil.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor para objetos de la clase Mujer sin un esposo.
     * 
     * @param p_nombre   Nombre de la mujer.
     * @param p_apellido Apellido de la mujer.
     * @param p_edad     Edad de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }
    
    /**
     * Constructor para objetos de la clase Mujer con un esposo.
     * 
     * @param p_nombre   Nombre de la mujer.
     * @param p_apellido Apellido de la mujer.
     * @param p_edad     Edad de la mujer.
     * @param p_esposo   Esposo de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    public void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    
    public void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    
    /**
     * Obtiene el nombre de la mujer.
     * 
     * @return Nombre de la mujer.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el apellido de la mujer.
     * 
     * @return Apellido de la mujer.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene la edad de la mujer.
     * 
     * @return Edad de la mujer.
     */
    public int getEdad(){
        return this.edad;
    }
    
    /**
     * Obtiene el estado civil de la mujer.
     * 
     * @return Estado civil de la mujer.
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    /**
     * Obtiene el esposo de la mujer.
     * 
     * @return Esposo de la mujer.
     */
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    /**
     * Realiza el divorcio de la mujer, estableciendo su estado civil como "Soltera" y sin esposo.
     */
    public void divorcio() {
        if (this.getEsposo() != null) {
            this.getEsposo().setEsposa(null);
            this.setEstadoCivil("Soltera");
            this.setEsposo(null);  
        }
    }
    
    /**
     * Realiza el matrimonio de la mujer con un hombre.
     * 
     * @param p_hombre Hombre con el que la mujer se casará.
     */
    public void casarseCon(Hombre p_hombre){
        if(this.getEsposo() == null){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
            this.getEsposo().casarseCon(this);  
        }
    }
    
    /**
     * Devuelve una cadena con los datos básicos de la mujer (nombre y edad).
     * 
     * @return Datos básicos de la mujer.
     */
    public String datos(){
        return this.getNombre() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Muestra el estado civil de la mujer en la consola.
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " de " + this.getEdad() + " años - " + this.getEstadoCivil());
    }
    
    /**
     * Muestra en la consola el estado civil de la mujer y el nombre y edad de su esposo, si está casada.
     */
    public void casadaCon(){
        if (this.getEsposo() != null) {
            System.out.println(this.getNombre() + " de " + this.getEdad() + " está casada con " + this.getEsposo().getNombre() + " de " + this.getEsposo().getEdad());
        } else {
            System.out.println(this.getNombre() + " de " + this.getEdad() + " no está casada.");
        }
    }
}
