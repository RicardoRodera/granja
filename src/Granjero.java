
public class Granjero
{
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private Mascota mascota;
    
    public Granjero(String nombre, String apellidos, int edad, char sexo)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre(){
        return nombre;
    }
    //prueba clase
    public String getApellidos(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setMascota(Mascota mascota){   
        this.mascota = mascota;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nGranjero");
        sb.append("\n====================");
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellidos: ");
        sb.append(apellidos);
        sb.append("\nEdad: ");
        sb.append(edad);
        sb.append("\nSexo: ");
        sb.append(sexo);
        sb.append(mascota);
        
        return sb.toString();
    }
}
