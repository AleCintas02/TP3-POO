

public class Circulo
{
    private double radio;
    private Punto centro;
   
    public Circulo(double p_radio, Punto p_centro)
    {
       setRadio(p_radio);
       setCentro(p_centro);
    }
    
    public Circulo()
    {
       this.setRadio(0);
       this.setCentro(new Punto(0.0, 0.0));
    }
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public Punto getCentro(){
        return this.centro;  
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }

    public double perimetro(){
        return (this.getRadio() * Math.PI * 2);
    }
    
    public double superficie(){
        return Math.PI*Math.pow(this.getRadio(), 2);
    }
 
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    public Circulo elMayor(Circulo otroCirculo){
        return this.superficie() > otroCirculo.superficie() ? this : otroCirculo;
    }
    
    public void mostrar(){
        System.out.println("** Circulo **");
        System.out.println("Centro: " + this.getCentro().getX() + " " + this.getCentro().getY() +"\t -Radio: "+this.getRadio());
        System.out.println("Superficie: " + this.superficie() +"\t -Radio: "+this.perimetro());
        
    }
    
}
