import java.io.*;
public class Persona implements Serializable{
    
    private String nombre;
    private int edad;
    private String domicilio;
    private String lugar_nacimiento;
    private String sexo;
    String espacio=" ";
    
    public Persona(String nombre, int edad, String domicilio, String lugar_nacimiento, String sexo){
        setnombre(nombre);
        setedad(edad);
        setdomicilio(domicilio);
        setlugar_nacimiento(lugar_nacimiento);
        setsexo(sexo);
    }
    
    public void setnombre(String nombre){
        if(nombre.length()<30)
                for(int i=nombre.length(); i<30; i++)
                    nombre=nombre+espacio;
           else
                nombre=nombre.substring(0,30);
                
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    public int getedad(){
        return edad;
    }
    
    public void setdomicilio(String domicilio){
        if(domicilio.length()<40)
                for(int i=domicilio.length(); i<40; i++)
                    domicilio=domicilio+espacio;
            else
                domicilio=domicilio.substring(0,40);
                
        this.domicilio=domicilio;
    }
    public String getdomicilio(){
        return domicilio;
    }
    
    public void setlugar_nacimiento(String lugar_nacimiento){
        if(lugar_nacimiento.length()<40)
                for(int i=lugar_nacimiento.length(); i<30; i++)
                   lugar_nacimiento=lugar_nacimiento+espacio;
            else
               lugar_nacimiento=lugar_nacimiento.substring(0,40);
               
        this.lugar_nacimiento=lugar_nacimiento;
    }
    public String getlugar_nacimiento(){
        return lugar_nacimiento;
    }
    
    public void setsexo(String sexo){
        this.sexo=sexo;
    }
    public String getsexo(){
        return sexo;
    }
    
    public String ToString(){
        if(edad<10)
            return nombre+"   "+" "+edad+" años   "+domicilio+"   "+lugar_nacimiento+"   "+sexo;
        
        return nombre+"   "+edad+" años   "+domicilio+"   "+lugar_nacimiento+"   "+sexo;
    }

}