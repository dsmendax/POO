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
    
    public void cambiarestado(Radio r){
        r.setestado(!r.getestado());   
    }
   
    public void subirvolumen(Radio r){
        if(r.getvolact()<r.getvolmax())
           r.setvolact(r.getvolact()+1);
    }
    
    public void bajarvolumen(Radio r){
        if(r.getvolact()>0)
           r.setvolact(r.getvolact()-1);
    }
    
    public void avanzarestacion(Radio r){
        if(r.getestact()<120)
           r.setestact(r.getestact()+1); 
    }
    
    public void regresarestacion(Radio r){
        if(r.getestact()>=80)
           r.setestact(r.getestact()-1);
    }
}
