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
    
    public void cambiarestado(Tele t, Control c){
        c.cambiarestado(t);
    }
    
    public void subirvolumen(Tele t, Control c){
        c.subirvolumen(t);
    }
    
    public void bajarvolumen(Tele t, Control c){
        c.bajarvolumen(t);
    }
    
    public void avanzarcanal(Tele t, Control c){
        c.avanzarcanal(t);
    }
    
    public void regresarcanal(Tele t, Control c){
        c.regresarcanal(t);
    }
}