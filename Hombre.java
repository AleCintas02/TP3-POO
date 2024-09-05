/**
 * La clase Hombre representa a un hombre con atributos como nombre, apellido, edad, estado civil y esposa.
 * Permite modificar el estado civil y gestionar el matrimonio con una instancia de la clase `Mujer`.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * Constructor para crear un hombre con nombre, apellido y edad. El estado civil se establece como "Soltero".
     * 
     * @param p_nombre el nombre del hombre
     * @param p_apellido el apellido del hombre
     * @param p_edad la edad del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    
    /**
     * Constructor para crear un hombre con nombre, apellido, edad y esposa.
     * 
     * @param p_nombre el nombre del hombre
     * @param p_apellido el apellido del hombre
     * @param p_edad la edad del hombre
     * @param p_esposa la esposa del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
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
    
    public void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    /**
     * Realiza un divorcio, eliminando la esposa y cambiando el estado civil a "Soltero".
     */
    public void divorcio(){
        this.setEsposa(null);
        this.setEstadoCivil("Soltero");
    }
    
    /**
     * Permite al hombre casarse con una mujer, cambiando su estado civil a "Casado".
     * 
     * @param p_mujer la mujer con la que se desea casar
     */
    public void casarseCon(Mujer p_mujer){
        if(this.getEsposa() == null){
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado");
            p_mujer.casarseCon(this);
        }
    }
    
    /**
     * Retorna una cadena con el nombre y la edad del hombre.
     * 
     * @return una cadena con el nombre y la edad del hombre
     */
    public String datos(){
        return this.getNombre() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Muestra el estado civil del hombre.
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " de " + this.getEdad() + " años - " + this.getEstadoCivil());
    }
    
    /**
     * Muestra el estado civil del hombre y su esposa si está casado.
     */
    public void casadoCon(){
         if(this.getEsposa() != null) {
             System.out.println(this.getNombre() + " de " + this.getEdad() + " está casado con " + this.getEsposa().getNombre() + " de " + this.getEsposa().getEdad());
         } else {
             System.out.println(this.getNombre() + " de " + this.getEdad() + " no está casado.");
         }
    }
}
