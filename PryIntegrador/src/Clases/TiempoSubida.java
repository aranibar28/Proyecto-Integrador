
package Clases;
import java.text.DecimalFormat;
public class TiempoSubida extends AnguloVelocidad {
    DecimalFormat sd=new DecimalFormat("#.##");
    
    public TiempoSubida(double angulo,double velocidad){
        super(angulo,velocidad);                
    }
    
    public double TiempoSubida(){
        double Ts = ((getVelocidad()) * (Math.sin(Math.toRadians(getAngulo())))) / (9.81);
        return Ts;
    }
    
    public String Resultado(){
        return sd.format(TiempoSubida());
    }
        public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n    Angulo = " +getAngulo()+
                "\n    Velocidad = " +getVelocidad()+
                "\n"+
                "\n Entonces : "+
                "\n Aplicamos la formula de TIEMPO DE SUBIDA "+ 
                "\n"+ 
                "\n                     (Vi) * Sen(α) "+
                "\n    Tsubida = ---------------------"+
                "\n                         2G        "+ 
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es 9,81 "+ 
                "\n"+
                "\n                      "+getVelocidad()+" x Sen("+getAngulo()+") "+
                "\n    Tsubida = ----------------------------"+
                "\n                             9,81        "+ 
                "\n"+
                "\n Calculamos :  "+
                "\n El resultado obtenido es : "+Resultado()+" segundos"+ 
                 "\n===========================================================================";               
        }
}