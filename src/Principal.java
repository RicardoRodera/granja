
/**
 * @author Ricardo 
 * @version 0.1
 */
public class Principal
{
    
    public static void main(String[] args){
        Granjero paco = new Granjero("Paco", "de la Pereda", 79, '?');
        Granja granjaDePaco = new Granja("Pacolandia", "Corea del Norte", paco);
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        paco.setMascota(mascota);
        System.out.println(granjaDePaco);
    }

}
