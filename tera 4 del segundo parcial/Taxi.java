
/**
 * Write a description of class Taxi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taxi extends Transporte
{
   private String placa;
   private int precio;
   private boolean disponible;
   public Taxi(int horaSalida, int horaLlegada, String nombreEmpresa, String placa){
       super(horaSalida, horaLlegada,nombreEmpresa);
       this.placa = placa;
       precio = 15;
       disponible = false;
   }
   public void setDisponibleTaxi( boolean disponibilidad){
       disponible = disponibilidad;
   }
}
