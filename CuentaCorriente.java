
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
        this.limiteDescubierto = p_limiteDescubierto;
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
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void mostrar(){
        System.out.println("- Cuenta Corriente –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}
