
public class Hospital
{
    
    private String nombreHospital;
    private String nombreDirector;
   
    public Hospital()
    {
       
    }
    
    public String getHospital(){
        return this.nombreHospital;
    }
    
    public String getDirector(){
        return this.nombreDirector;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getHospital() + "\tDirector: "+ this.getDirector());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + "\tHistroia clinica: "+ p_paciente.getHistoria() + "\tDomiclio: " + p_paciente.getDomicilio()); 
        
         System.out.println("Localidad: " + p_paciente.getVive().getNombre() + "\tProvincia: "+ p_paciente.getVive().getProvincia() );
    }

   
}  
