
/**
 * Write a description of class Motocicleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motocicleta extends Transporte
{
    private int precio;
    private boolean disponible;
    private String placa;
    public Motocicleta(int horaSalida, int horaLlegada, String nombreEmpresa, String placa){
       super(horaSalida, horaLlegada, nombreEmpresa);
       precio = 5;
       disponible = false;
       this.placa = placa;
    }
    public void setDisponibleMoto(boolean disponibilidad){
       disponible = disponibilidad;
    }
}
