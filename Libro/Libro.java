public class Libro{
    
    private boolean estado;
    private String titulo;
    private int numpag;
    private int pagact;
    
    public Libro(boolean estado, int numpag, int pagact, String titulo)
    {
        setestado(estado);
        setnumpag(numpag);
        setpagact(pagact);
        settitulo(titulo);
    }
    
    public void setnumpag(int numpag){
        this.numpag=numpag;
    
    }
    public int getnumpag(){
        return numpag;
    
    }
    
    public void setpagact(int pagact){
        this.pagact=pagact;
    
    }
    public int getpagact(){
        return pagact;
    
    }
    
    public void setestado(boolean estado)
    {
        this.estado=estado;
    }
    public boolean getestado()
    {
        return estado;
    }
    
    public void settitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String gettitulo()
    {
        return titulo;
    }
}
