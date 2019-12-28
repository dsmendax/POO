
public class Persona
{
  private String nombre;
  public Persona(String nombre)
  {
   this.nombre=nombre; 
  }
  public String abrirpuerta(Puerta p,Llave l)
  {
      if(!p.getestado())
      return"La puerta ya esta abierta";
      if (l.getcodigo()==p.getc().getcodigo())
      {
        p.setestado(true);
        return"La puerta ha sido abierta";
       
      }
       return"Busca tu llave";
  }
  
  public String cerrarpuerta(Puerta p)
  {
      if(p.getestado())
      {
         p.setestado(false);
         return "Amable usuario la puerta ha sido cerrada";
        
      }
       return "La puerta ya esta cerrada";
  }
}