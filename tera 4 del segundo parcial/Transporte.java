
/**
 * Write a description of class Transporte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transporte
{
   private int horaSalida;
   private int horaLlegada;
   private String nombreEmpresa;
   public Transporte(int horaSalida, int horaLlegada, String nombreEmpresa){
       this.horaSalida = horaSalida;
       this.horaLlegada = horaLlegada;
       this.nombreEmpresa = nombreEmpresa;
   }
   public void setHoraSalida(int horSalida){
       horaSalida = horSalida;
   }
   public void setHoraLlegada(int horLlegada){ 
       horaLlegada = horLlegada;
   }
}
