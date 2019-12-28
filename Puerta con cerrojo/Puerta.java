public class Puerta
{
    private boolean estado;
    private Cerrojo c;
    
    public Puerta (Cerrojo c)
    {
        estado=false;
        this.c=c;
    }
    
    public void setestado(boolean estado)
    {
        this.estado=estado;
    }
    public boolean getestado()
    {
        return estado;
    }
    public void setc(Cerrojo c)
    {
        this.c=c;
    }
    public Cerrojo getc()
    {
        return c;
    }
}