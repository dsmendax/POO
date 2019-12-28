public class Plato
{private boolean estado;
    private int capactual;
    private int capatotal;
    public Plato(boolean estado, int capactual, int capatotal){
        setestado(estado);
        setcapactual(capactual);
        setcapatotal(capatotal);
    }
    
     public void setestado(boolean estado){
        this.estado=estado;    
    }
    public boolean getestado(){
        return estado;
    }

    public void setcapactual(int capactual){
        if(capactual>=0 && capactual<=capatotal)
           this.capactual=capactual;
           
        else this.capactual=1;
    }
    public int getcapactual(){
        return capactual;
    }
    
    public void setcapatotal(int capatotal)
    {if(capatotal>=0 && capatotal<=1)
           this.capatotal=capatotal;
           
        else this.capatotal=1;
    }
    public int getcapatotal(){
        return capatotal;
    }
}
