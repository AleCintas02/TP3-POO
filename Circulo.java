
/**
 * La clase Circulo representa un círculo definido por su radio y centro.
 * Proporciona métodos para establecer y obtener estos atributos, así como para calcular el perímetro, la superficie,
 * la distancia a otro círculo, y para mostrar la información del círculo.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Circulo
{
    private double radio;
    private Punto centro;
   
    /**
     * Constructor para objetos de la clase Circulo con radio y centro específicos.
     * 
     * @param p_radio Radio del círculo.
     * @param p_centro Punto que representa el centro del círculo.
     */
    public Circulo(double p_radio, Punto p_centro)
    {
       setRadio(p_radio);
       setCentro(p_centro);
    }
    
    /**
     * Constructor por defecto que inicializa el radio a 0 y el centro en el punto (0, 0).
     */
    public Circulo()
    {
       this.setRadio(0);
       this.setCentro(new Punto(0.0, 0.0));
    }
    
    /**
     * Establece el radio del círculo.
     * 
     * @param p_radio Radio del círculo.
     */
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    /**
     * Establece el centro del círculo.
     * 
     * @param p_centro Punto que representa el centro del círculo.
     */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    /**
     * Obtiene el radio del círculo.
     * 
     * @return Radio del círculo.
     */
    public double getRadio(){
        return this.radio;
    }
    
    /**
     * Obtiene el centro del círculo.
     * 
     * @return Punto que representa el centro del círculo.
     */
    public Punto getCentro(){
        return this.centro;  
    }
    
    /**
     * Desplaza el centro del círculo en las direcciones especificadas.
     * 
     * @param p_dx Desplazamiento en la dirección x.
     * @param p_dy Desplazamiento en la dirección y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }

    /**
     * Calcula el perímetro del círculo.
     * 
     * @return Perímetro del círculo.
     */
    public double perimetro(){
        return (this.getRadio() * Math.PI * 2);
    }
    
    /**
     * Calcula la superficie del círculo.
     * 
     * @return Superficie del círculo.
     */
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
 
    /**
     * Calcula la distancia entre el centro del círculo y el centro de otro círculo.
     * 
     * @param otroCirculo Otro círculo para calcular la distancia.
     * @return Distancia entre los centros de los dos círculos.
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * Devuelve el círculo con la mayor superficie entre el círculo actual y otro círculo.
     * 
     * @param otroCirculo Otro círculo para comparar.
     * @return El círculo con la mayor superficie.
     */
    public Circulo elMayor(Circulo otroCirculo){
        return this.superficie() > otroCirculo.superficie() ? this : otroCirculo;
    }
    
    /**
     * Muestra la información del círculo, incluyendo el centro, radio, superficie y perímetro.
     */
    public void mostrar(){
        System.out.println("** Circulo **");
        System.out.println("Centro: " + this.getCentro().getX() + " " + this.getCentro().getY() + "\t -Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + "\t -Perímetro: " + this.perimetro());
    }
}

