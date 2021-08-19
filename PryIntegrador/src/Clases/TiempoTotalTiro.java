
package Clases;
import java.text.DecimalFormat;
public class TiempoTotalTiro extends AnguloVelocidad {
     DecimalFormat sd=new DecimalFormat("#.##");
     
      public TiempoTotalTiro(double angulo,double velocidad){
        super(angulo,velocidad);           
    }
    
    public double TiempoTotal(){
        double TT = ((2 * getVelocidad()) * (Math.sin(Math.toRadians(getAngulo())))) / 9.81;
        return TT;
    }
    
    public String Resultado(){
        return sd.format(TiempoTotal());
    }
    
     public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n    Angulo = " +getAngulo()+
                "\n    Velocidad = " +getVelocidad()+
                "\n"+
                "\n Entonces : "+
                "\n Aplicamos la formula de TIEMPO DE VUELO "+ 
                "\n"+ 
                "\n                   2(Vi) * Sen(θ) "+
                "\n    Tvuelo = --------------------"+
                "\n                         G        "+ 
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es 9,81 "+ 
                "\n"+
                "\n                   2("+getVelocidad()+") x Sen("+getAngulo()+") "+
                "\n    Tvuelo = ------------------------------"+
                "\n                             9,81        "+ 
                "\n"+
                "\n Calculamos :  "+
                "\n El resultado obtenido es : "+Resultado()+" segundos"+ 
                 "\n===========================================================================";    
                
        }
}
