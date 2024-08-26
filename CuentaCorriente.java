
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(0.0);
       this.setLimiteDescubierto(500.0);
       this.setTitular(p_titular);
    }
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setLimiteDescubierto(500.0);
       this.setTitular(p_titular);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = limiteDescubierto;
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
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo()+p_importe);
    }
    
    private boolean puedeExtraer(double p_importe){
        return p_importe <= (this.getSaldo() + this.getLimiteDescubierto()); 
    }
}
