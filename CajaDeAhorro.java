
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);  
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular); 
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo()+p_importe);
    }
    
    private boolean puedeExtraer(double p_importe){
        return p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0; 
    }
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            if(this.getExtraccionesPosibles() == 0){
                System.out.println("No tiene habilitadas mas extracciones!");
                
            }else{
                if(p_importe > this.getSaldo()){
                     System.out.println("No puede extraer mas que el saldo!");
                }
            }
        } 
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles()-1);
    }
    
    public void mostrar(){
        System.out.println("- Caja de Ahorro –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
   
}
