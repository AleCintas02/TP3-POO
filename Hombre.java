
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    public Hombre( String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    
    public Hombre( String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
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
    
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil= p_estadoCivil;
    }
    
    private void setEsposa(Mujer p_esposa){
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
    
    public void divorcio(){
        this.setEsposa(null);
        this.setEstadoCivil("Soltero");
    }
    
    public void casarseCon(Mujer p_mujer){
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }
    
    public String datos(){
        return this.getNombre() + " de " + this.getEdad() + " años";
    }
    
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " de " + this.getEdad() + " años - " + this.getEstadoCivil());
    }
    
    public void casadoCon(){
         System.out.println(this.getNombre() + " de " + this.getEdad() + " está casado con " + this.getEsposa().getNombre() + " de " + this.getEsposa().getEdad());
    }


}
