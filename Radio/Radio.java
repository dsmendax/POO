public class Radio
{
    private boolean estado;
    private int estacion;
    private int volmax;
    private int estact;
    private int volact;
    
    public Radio(boolean estado, int estacion, int volmax, int estact, int volact){
        setestado(estado);
        setvolmax(volmax);
        setestact(estact);
        setvolact(volact);
    }
    
    public void setestado(boolean estado){
        this.estado=estado;    
    }
    public boolean getestado(){
        return estado;
    }
    
    public void setestacion(int estacion){
        if(estacion>=80 && estacion<120)
           this.estacion=estacion;
           
        else this.estact=80;
    }
    public int getestacion(){
        return estacion;
    }
    
     public void setestact(int estact){
        if(estact>=80 && estact<=100)
           this.estact=estact;
           
        else this.estact=80;
    }
    public int getestact(){
        return estact;
    }
    
    public void setvolmax(int volmax){
        if(volmax>=0 && volmax<100)
           this.volmax=volmax;
           
        else this.volmax=100;
    }
    public int getvolmax(){
        return volmax;
    }
    
    public void setvolact(int volact){
        if(volact>=0 && volact<=volmax)
           this.volact=volact;
           
        else this.volact=0;
    }
    public int getvolact(){
        return volact;
    }
  
}



