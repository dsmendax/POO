public class Persona
{
    private String nombre;
    
    public Persona(String nombre){
        setnombre(nombre);
    
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void abrirpuerta(Puerta p){
       if(p.getestado()==false){
           p.setestado(true);
        }
    }
    
   public void cerrarpuerta(Puerta p){
       if(p.getestado()==true){
           p.setestado(false);
        }
    }  
    
}