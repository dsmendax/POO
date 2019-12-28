public class Control
{
    public void cambiarestado(Tele t){
        t.setestado(!t.getestado());   
    }
   
    public void subirvolumen(Tele t){
        if(t.getvolact()<t.getvolmax())
           t.setvolact(t.getvolact()+1);
    }
    
    public void bajarvolumen(Tele t){
        if(t.getvolact()>0)
           t.setvolact(t.getvolact()-1);
    }
    
    public void avanzarcanal(Tele t){
        if(t.getcanalac()<100)
           t.setcanalac(t.getcanalac()+1); 
    }
    
    public void regresarcanal(Tele t){
        if(t.getcanalac()>1)
           t.setcanalac(t.getcanalac()-1);
        
        else t.setcanalac(t.getcanalmax());
    }
}