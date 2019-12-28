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
    
    public void tomarlapiz(Lapiz l){
        if(l.getestado()==false)
           l.setestado(true);
        }
    
    public String esccribir(Papel p, Lapiz l){
        return "Estoy escribiendo";
    
    }
    
}
