import java.io.*;
import java.util.Random;

public class Crear_Persona {
    private String mujeres[] = new String [50];
    private String hombres[] = new String [50];
    private String domicilio[] = new String [50];
    private String lugar_nac[] = new String [50];
    private String apellidos[] = new String [100];
    private Persona arreglopersonas[] = new Persona [5000];
    private int total=0;
    private int contper=0;
    
    public void leer_archivos() throws IOException{
        File archivo_Entrada = new File("mujeres.txt");
        FileReader lector_Archivo = new FileReader(archivo_Entrada);
        BufferedReader lector_Buf = new BufferedReader(lector_Archivo);
        
        File archivo_Entrada2 = new File("hombres.txt");
        FileReader lector_Archivo2 = new FileReader(archivo_Entrada2);
        BufferedReader lector_Buf2 = new BufferedReader(lector_Archivo2);
        
        File archivo_Entrada3 = new File("apellidos.txt");
        FileReader lector_Archivo3 = new FileReader(archivo_Entrada3);
        BufferedReader lector_Buf3 = new BufferedReader(lector_Archivo3);
        
        File archivo_Entrada4 = new File("domicilio.txt");
        FileReader lector_Archivo4 = new FileReader(archivo_Entrada4);
        BufferedReader lector_Buf4 = new BufferedReader(lector_Archivo4);
        
        File archivo_Entrada5 = new File("lugarnac.txt");
        FileReader lector_Archivo5 = new FileReader(archivo_Entrada5);
        BufferedReader lector_Buf5 = new BufferedReader(lector_Archivo5);
        
        int x=0;
        String n="";
        
        while((n=lector_Buf.readLine()) != null){
            mujeres[x]=n;
            x++;
        }
        
        x=0;
        while((n=lector_Buf2.readLine()) != null){
            hombres[x]=n;
            x++;
        }
        
        x=0;
        while((n=lector_Buf3.readLine()) != null){
            apellidos[x]=n;
            x++;
        }
        
        x=0;
        while((n=lector_Buf4.readLine()) != null){
            domicilio[x]=n;
            x++;
        }
        
        x=0;
        while((n=lector_Buf5.readLine()) != null){
            lugar_nac[x]=n;
            x++;
        }
    }
    
    public boolean lleno(){
        return contper==5000;    
    }

    public void agregarpersona(Persona persona){
        if(!lleno()){
            arreglopersonas[contper]=persona;
            contper++;
        }    
    }
    
    public void generamujeres(){
        Random nr = new Random();
        int x=0;
        while(x<2500){
            String nombre=apellidos[(int)(nr.nextDouble()*100)]+" "+apellidos[(int)(nr.nextDouble()*100)]+" "+mujeres[(int)(nr.nextDouble()*50)];
            int edad=(int)(nr.nextDouble()*100);
            String domicilios=domicilio[(int)(nr.nextDouble()*50)]+" #"+(int)(nr.nextDouble()*600);
            String lugar_naci=lugar_nac[(int)(nr.nextDouble()*50)];
            
            Persona p = new Persona(nombre, edad, domicilios, lugar_naci, "Femenino"); 
            if(!serepite(p)){
                agregarpersona(p);
                x++;   
            }
        }    
    }
    
    public void generaHombres(){
        Random nr = new Random();
        int x=0;
        while(x<2500){
            String nombre=apellidos[(int)(nr.nextDouble()*100)]+" "+apellidos[(int)(nr.nextDouble()*100)]+" "+hombres[(int)(nr.nextDouble()*50)];
            int edad=(int)(nr.nextDouble()*100);
            String domicilios=domicilio[(int)(nr.nextDouble()*50)]+"#"+(int)(nr.nextDouble()*600);
            String lugar_naci=lugar_nac[(int)(nr.nextDouble()*50)];
            
            Persona p = new Persona(nombre, edad, domicilios, lugar_naci, "Masculino"); 
            if(!serepite(p)){
                agregarpersona(p);
                x++;   
            }
        }    
    }
    
    public boolean serepite(Persona per){
        boolean band=false;
        for(int i=0; i<contper; i++){
            if(arreglopersonas[i].getnombre().equals(per.getnombre())){
                band=true;
                break;            
            }
        }
        return band;
    }
    
    public void escribir()throws IOException{ 
        FileWriter archivopersonas = new FileWriter("personas.txt");
        for(int i=0; i<contper; i++){
            archivopersonas.write(arreglopersonas[i].ToString()+"\r\n");
        }
        archivopersonas.close();      
    }
 }