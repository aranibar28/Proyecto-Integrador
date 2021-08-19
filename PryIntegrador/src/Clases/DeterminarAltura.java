package Clases;
import java.text.DecimalFormat;
public class DeterminarAltura extends AnguloVelocidad {
    DecimalFormat sd=new DecimalFormat("#.##");
       
   public double distancia;
    
    public DeterminarAltura(double angulo,double velocidad,double distancia){
       super(angulo,velocidad);
       this.distancia=distancia;
    }
    
    public double Velocidadx(){
        double vx=(getVelocidad() * Math.cos(Math.toRadians(getAngulo())));
        return vx;
    }
    
    public double Tiempo(){    
    return Velocidadx()/distancia;
    }
    
    public double Velocidady(){
        double vy=(getVelocidad() * Math.sin(Math.toRadians(getAngulo())) - 9.81*Tiempo());
        return vy;
    }
    
    public double Respuesta(){
        double h;
        h=Velocidady()*Tiempo()+0.5*9.81*(Math.pow(Tiempo(), 2));
        return h;    
    }
    
    public String Resultado(){
        return sd.format(Respuesta());
    }
    
    public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n    Angulo = " +getAngulo()+
                "\n    Velocidad = "+getVelocidad() +
                "\n    Distancia = " +distancia+
                "\n"+
                "\n Entonces : "+
                "\n Derivamos la velocidad en X e Y"+ 
                "\n"+ 
                "\n   Vx = "+sd.format(Velocidadx())+
                "\n   Vy = "+sd.format(Velocidady())+
                "\n"+
                "\n Luego Determinamos el tiempo en recorrer "+ distancia + " metros" +
                "\n"+
                "\n   t = Distancia / Velocidadx"+
                "\n   t = "+sd.format(Tiempo())+" segundos"+               
                "\n"+
                "\n Calculamos la altura en "+sd.format(Tiempo())+" segundos"+
                "\n   H = Vy * t + 1/2 * G * t^2 "+
                "\n   H = ("+sd.format(Velocidady())+") * ("+sd.format(Tiempo())+") + (0.5 * 9.81) * ("+sd.format(Tiempo())+")^2"+
                "\n   H = "+Resultado()+" m";                
        }
}
