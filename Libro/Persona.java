public class Persona
{
    private String nombre;

    public Persona(String nombre)
    {
        setnombre(nombre);
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    
    }
    public String getnombre(){
        return nombre;
    }
    
    public void abrirlibro(Libro L)
    {
        if(L.getestado()==false)
        L.setestado(true);
        //else return ("El libro ya esta abierto");
    
    }
    
    public void cerrarlibro(Libro L)
    {
        if(L.getestado()==true)
        L.setestado(false);
    }

    public void ponerseparador(Libro L, Separador S){
        if(!L.getestado())
        L.setestado(true);
    }
    
    public void avanzarpag(Libro L){
        if(L.getpagact()<L.getnumpag())
        L.setpagact(L.getpagact()+1);
    
    }
    public void retrocederpag(Libro L){
    if(L.getpagact()>0)
    L.setpagact(L.getpagact()-1);
    
    else
    L.setpagact(L.getnumpag());
    }
}
