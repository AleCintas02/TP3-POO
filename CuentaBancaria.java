

public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    
    public CuentaBancaria( int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
     public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Persona getPersona(){
        return this.titular;
    }
    
    public double depositar(double p_importe){
        double aumentarSaldo = this.getSaldo() + p_importe;
        this.setSaldo(aumentarSaldo);
        return this.getSaldo();
    }
    
    public double extraer(double p_importe){
        double disminuirSaldo = this.getSaldo() - p_importe;
        this.setSaldo(disminuirSaldo);
        return this.getSaldo();
        
    }
    
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: "+ this.getPersona().getNombre() + " (" + this.getPersona().edad() + " años)");
        System.out.println("Saldo: " + getSaldo());
    }
    
    public String toStrinf(){
        return this.getNroCuenta() + "\t" + this.getPersona().getNombre() + this.getPersona().getApellido() + "\t" + this.getSaldo();
    }
}
