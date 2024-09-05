
/**
 * La clase Docente representa un docente con información sobre su nombre, 
 * grado, sueldo básico y asignación familiar. Proporciona métodos para calcular 
 * el sueldo total del docente.
 * 
 * @author Cintas Alejandro
 * @author Lautaro Larroza
 */
public class Docente {
    
    // Atributos privados de la clase
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * Constructor de la clase {@code Docente}.
     * Inicializa el nombre, grado y sueldo básico, y establece un valor predeterminado para la asignación familiar.
     * 
     * @param p_nombre Nombre del docente.
     * @param p_grado  Grado del docente (ej. Profesor, Licenciado, etc.).
     * @param p_sueldoBasico Sueldo básico del docente.
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(1290.0); // Asignación familiar predeterminada
    }

    // Métodos privados para establecer los valores de los atributos
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setGrado(String p_grado) {
        this.grado = p_grado;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    private void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    // Métodos públicos para obtener los valores de los atributos
    public String getNombre() {
        return this.nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    /**
     * Calcula el sueldo total del docente sumando el sueldo básico y la asignación familiar.
     * 
     * @return El sueldo total del docente.
     */
    public double calcularSueldo() {
        return this.sueldoBasico + this.getAsignacionFamiliar();
    }
}
