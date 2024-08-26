
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
        this.setExtraccionesPosibles(0);
        this.setTitular(p_titular);  
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(0);
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
    
    public double getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    
   
}
