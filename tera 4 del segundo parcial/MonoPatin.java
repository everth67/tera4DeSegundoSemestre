
/**
 * Write a description of class MonoPatin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonoPatin extends Transporte
{
    private String color;
    private boolean disponible;
    private int precio;
    public MonoPatin(int horaSalida, int horaLlegada, String nombreEmpresa){
       super(horaSalida, horaLlegada, nombreEmpresa);
       String color = "celeste";
       disponible = false;
       precio = 3;
    }
    public void setDisponibleMono(boolean disponibilidad){
       disponible = disponibilidad;
    }
}
