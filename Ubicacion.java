import java.util.ArrayList;
public class Ubicacion{
    
    private String nombre;
    private float distanciaAlexandria;
    private int cantidadZombies;
    
    public static ArrayList<Ubicacion>ubicaciones = new ArrayList<Ubicacion>();
    
    public Ubicacion(String nombre, float distanciaAlexandria, int cantidadZombies){
        this.nombre = nombre;
        this.distanciaAlexandria = distanciaAlexandria;
        this.cantidadZombies = cantidadZombies;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDistanciaAlexandria(float distanciaAlexandria){
        this.distanciaAlexandria = distanciaAlexandria;
    }
    
    public void setCantidadZombies(int cantidadZombies){
        this.cantidadZombies = cantidadZombies;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public float getDistanciaAlexandria(){
        return this.distanciaAlexandria;
    }
    
    public int getCantidadZombies(){
        return this.cantidadZombies;
    }
    
    public String toString1(){
        return "Nombre: "+this.getNombre()+" "+ "Distancia a Alexandria: "+this.getDistanciaAlexandria()+" "+ "Cantidad de zombies: "+this.getCantidadZombies();
    }
    
    
  
}

               
    
            
    