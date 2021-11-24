
public class Granja
{
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    
    public Granja(Granjero granjero)
    {
        this.granjero = granjero;
    }
    //hola
    public Granja(String nombre, String ubicacion, Granjero granjero){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        //Cesar te amamoss
        sb.append("\nGrangasxzxzx");
        sb.append("\n====================");
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nUbicacion: ");
        sb.append(ubicacion);
        sb.append(granjero);      
        
        return sb.toString();
    }

}
