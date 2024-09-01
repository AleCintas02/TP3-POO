import java.util.*;

/**
 * La clase Empleado representa a un empleado con información personal y salarial.
 */
public class Empleado {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    private Calendar fechaIngreso;
    

    /**
     * Constructor para inicializar un empleado con los detalles proporcionados.
     * 
     * @param p_cuil         el CUIL del empleado
     * @param p_apellido     el apellido del empleado
     * @param p_nombre       el nombre del empleado
     * @param p_sueldoBasico el sueldo básico del empleado
     * @param p_anioIngreso  el año de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
    }
    
    /**
     * Constructor para inicializar un empleado con los detalles proporcionados.
     * 
     * @param p_cuil         el CUIL del empleado
     * @param p_apellido     el apellido del empleado
     * @param p_nombre       el nombre del empleado
     * @param p_sueldoBasico el sueldo básico del empleado
     * @param p_fecha la fecha de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fecha);
    }
    
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso=p_fecha;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

 
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
  
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }


    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    public Calendar getFecha() {
        return this.fechaIngreso;
    }

    public long getCuil() {
        return this.cuil;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    /**
     * Devuelve el nombre y el apellido del empleado.
     * 
     * @return el nombre y el apellido del empleado
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Devuelve el apellido y el nombre del empleado.
     * 
     * @return el apellido y el nombre del empleado
     */
    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Calcula la antigüedad del empleado en años.
     * 
     * @return la antigüedad del empleado en años
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }

    /**
     * Calcula el descuento aplicado al sueldo del empleado.
     * 
     * @return el descuento total
     */
    private double descuento() {
        double descuentoObraSocial = this.getSueldoBasico() * 0.02;
        return descuentoObraSocial + 1500;
    }

    /**
     * Calcula el adicional al sueldo del empleado basado en su antigüedad.
     * 
     * @return el adicional al sueldo
     */
    private double adicional() {
        double asignacion;
        if (antiguedad() < 2) {
            asignacion = this.getSueldoBasico() * 0.02;
        } else if (antiguedad() >= 2 && antiguedad() < 10) {
            asignacion = this.getSueldoBasico() * 0.04;
        } else {
            asignacion = this.getSueldoBasico() * 0.06;
        }
        return asignacion;
    }

    /**
     * Calcula el sueldo neto del empleado.
     * 
     * @return el sueldo neto del empleado
     */
    public double sueldoNeto() {
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }

    /**
     * Muestra la información del empleado en la consola.
     */
    public void mostrar() {
        System.out.println("Nombre y apellido: " + this.nomYApe() + "\n CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad()
                + "\nSueldo Neto: " + this.sueldoNeto());
    }

    /**
     * Devuelve la información del empleado en una línea.
     * 
     * @return la información del empleado en una línea
     */
    public String mostrarLinea() {
        return this.getCuil() + " " + this.apeYNom() + " " + this.sueldoNeto();
    }
    
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH); 
        int diaIngreso = this.getFecha().get(Calendar.DAY_OF_MONTH);
        int mesIngreso = this.getFecha().get(Calendar.MONTH);

        return diaHoy == diaIngreso && mesHoy == mesIngreso;
    }
}
