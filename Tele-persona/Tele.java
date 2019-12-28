public class Tele
{
    private boolean estado;
    private int canalmax;
    private int volmax;
    private int canalac;
    private int volact;
    
    public Tele(boolean estado, int canalmax, int volmax, int canalac, int volact){
        setestado(estado);
        setcanalmax(canalmax);
        setvolmax(volmax);
        setcanalac(canalac);
        setvolact(volact);
    }
    
    public void setestado(boolean estado){
        this.estado=estado;    
    }
    public boolean getestado(){
        return estado;
    }
    
    public void setcanalmax(int canalmax){
        if(canalmax>0 && canalmax<10)
           this.canalmax=canalmax;
           
        else this.canalmax=10;
    }
    public int getcanalmax(){
        return canalmax;
    }
    
     public void setcanalac(int canalac){
        if(canalac>0 && canalac<=canalmax)
           this.canalac=canalac;
           
        else this.canalac=1;
    }
    public int getcanalac(){
        return canalac;
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

