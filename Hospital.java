
public class Hospital
{
    
    private String nombreHospital;
    private String nombreDirector;
   
    public Hospital(String p_hospital, String p_director)
    {
       this.setHospital(p_hospital);
       this.setDirector(p_director);
    }
    
    private void setHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    public String getHospital(){
        return this.nombreHospital;
    }
    
    public String getDirector(){
        return this.nombreDirector;
    }
    
   public void consultaDatosFiliatorios(Paciente p_paciente) {
    System.out.println("Hospital: " + this.getHospital() + "\tDirector: " + this.getDirector());
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Paciente: " + p_paciente.getNombre() + " \tHistoria clínica: " + p_paciente.getHistoria() + " \tDomicilio: " + p_paciente.getDomicilio());
    System.out.println("Localidad: " + p_paciente.getVive().getNombre() + " \tProvincia: " + p_paciente.getVive().getProvincia());
}


   
}  
