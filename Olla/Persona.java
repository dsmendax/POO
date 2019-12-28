public class Persona
{
    private String nombre;
    
    public Persona(String nombre){
    
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void servirplato(Olla o, Plato p){
        //if(o.getcapactual()<0 && p.getcapactual()==0)
           o.setcapactual(o.getcapactual()-1);
           p.setcapactual(p.getcapactual()+1);
    
    }
    
    public void comer(Plato p){
        p.setcapactual(p.getcapactual()-1);
    
    }
    
    public void llenarolla(Olla o){
        o.setcapactual(o.getcapactual()+5);
    
    }
    
    
}
