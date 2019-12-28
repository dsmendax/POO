public class Relojito
{
    private int hora;
    private int min;
    private int seg;
    
    public Relojito(int hora, int min, int seg){
        setseg(seg);
        setmin(min);
        sethora(hora);
    }
    
    public void setseg(int seg){
        if(seg>=0 && seg<60)
         this.seg=seg;
        
        else this.seg=0;       
    }
    public int getseg(){
        return seg;
    }
    
    public void setmin(int min){
        if(min>=0 && min<60)
         this.min=min;
        
        else this.min=0;   
    }
    public int getmin(){
        return min;
    
    }
    
    public void sethora(int hora){
        if(hora>=0 && hora<24)
         this.hora=hora;
        
        else this.hora=0;
    }
    public int gethora(){
        return hora;
    
    }
    
    public void avanzseg(){
        if(seg<59)
         seg++;
        
        else{
            seg=0;
            avanzamin();
       }
    }
    
    public void avanzamin(){
        if(min<59)
         min++;
        
        else{
            min=0;
            avanzahora();
        
        }
    }
    
    public void avanzahora(){
        if(hora<23)
         hora++;
        
        else{
            hora=0;      
        }
    }
    
    public void retrocedeseg(){
        if(seg>0)
         seg--;
        
        else{
            seg=59;
            retrocedermin();
        }
    }
    
    public void retrocedermin(){
        if(min>0)
         min--;
         
        else{
            min=59;
            retrocederhora();
        }
    }
    
    public void retrocederhora(){
        if(hora>0)
         hora--;
         
        else{
            hora=23;
        }
    }
    
}