import java.util.*;
/**
 * La clase Persona representa a una persona con DNI, nombre, apellido y año de nacimiento.
 * Proporciona métodos para establecer y obtener estos atributos, calcular la edad y mostrar la información de la persona.
 */
public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor para objetos de la clase Persona.
     * 
     * @param p_dni          Número de DNI de la persona.
     * @param p_nombre       Nombre de la persona.
     * @param p_apellido     Apellido de la persona.
     * @param p_anio         Año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    

    private void setDNI(int p_dni) {
        nroDni = p_dni;
    }

    
    private void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        apellido = p_apellido;
    }

    private void setAnioNacimiento(int p_anio) {
        Calendar nuevaFecha = Calendar.getInstance();
        nuevaFecha.set(p_anio, 1, 1);
        this.setFechaNacimiento(nuevaFecha);
    }

    public int getDNI() {
        return this.nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }
  
    public String getApellido() {
        return this.apellido;
    }

    public int getAnioNacimiento() {
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    /**
     * Calcula y devuelve la edad de la persona basada en el año actual.
     * 
     * @return Edad de la persona.
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = anioHoy - this.getAnioNacimiento();
        return edad;
    }

    /**
     * Devuelve una cadena con el nombre y apellido de la persona.
     * 
     * @return Nombre y apellido de la persona.
     */
    public String nomYApe() {
        return nombre + " " + apellido;
    }
    
    public boolean esCumpleanos() {
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH); 
        int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);

        return diaHoy == diaNacimiento && mesHoy == mesNacimiento;
    }


    /**
     * Muestra la información de la persona, incluyendo nombre, apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("nombre y apellido: " + nomYApe() + " DNI: " + nroDni + " Edad: " + edad());
    }
}
