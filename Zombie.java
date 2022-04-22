import java.util.ArrayList;
public class Zombie{
    private String nombre;
    private int salud;
    private String fechaNacimiento;
    private String tipoSangre;
    
    public static ArrayList<Zombie>zombies = new ArrayList<Zombie>();
    
    public Zombie(String nombre, int salud, String fechaNacimiento, String tipoSangre){
        this.nombre = nombre;
        this.salud = salud;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSalud(int salud){
        this.salud = salud;
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setTipoSangre(String tipoSangre){
        this.tipoSangre = tipoSangre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getSalud(){
        return this.salud;
    }
    
    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public String getTipoSangre(){
        return this.tipoSangre;
    }
    
    public String toString(){
        return "Nombre: "+this.getNombre() + " " + "Salud: "+this.getSalud()+" "+" Fecha de nacimiento: "+this.getFechaNacimiento()+" "+"Tipo de sangre: "+this.getTipoSangre();
    }
    
  
    public static void lanzarBomba(){
        for(int i=0; i<Zombie.zombies.size(); i++){
            Zombie.zombies.get(i).setSalud((Zombie.zombies.get(i).getSalud())/2);
        }
    }
    
    
}