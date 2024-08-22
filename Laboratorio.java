/**
 * La clase Laboratorio representa un laboratorio con información sobre su nombre,
 * domicilio, teléfono, compra mínima y día de entrega.
 */
public class Laboratorio {
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor para objetos de la clase Laboratorio.
     * 
     * @param p_nombre      Nombre del laboratorio.
     * @param p_domicilio   Domicilio del laboratorio.
     * @param p_telefono    Teléfono del laboratorio.
     * @param p_compraMin   Compra mínima del laboratorio.
     * @param p_diaEnt      Día de entrega del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        setNombre(p_nombre);
         setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(p_compraMin);
        setDiaEntrega(p_diaEnt);
    }

    /**
     * Constructor para objetos de la clase Laboratorio con compra mínima y día de entrega predeterminados.
     * 
     * @param p_nombre      Nombre del laboratorio.
     * @param p_domicilio   Domicilio del laboratorio.
     * @param p_telefono    Teléfono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(0);
        setDiaEntrega(0);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public int getCompraMin(){
        return this.compraMinima;
    }
    
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    /**
     * Establece una nueva compra mínima para el laboratorio.
     * 
     * @param p_compraMin   Nueva compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMin) {
        setCompraMin(p_compraMin);
    }

    /**
     * Establece un nuevo día de entrega para el laboratorio.
     * 
     * @param p_diaEnt      Nuevo día de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEnt) {
        setDiaEntrega(p_diaEnt);
    }

    /**
     * Devuelve una cadena con la información del laboratorio.
     * 
     * @return Información del laboratorio.
     */
    public String mostrar() {
        String info = "nombre: " + nombre;
        info += "\ndomicilio: " + domicilio + " telefono: " + telefono;
        return info;
    }
}
