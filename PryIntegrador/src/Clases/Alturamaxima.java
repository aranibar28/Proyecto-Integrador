package Clases;
import java.text.DecimalFormat;
public class Alturamaxima extends AnguloVelocidad{
     DecimalFormat sd=new DecimalFormat("#.##");
     
     public Alturamaxima(double angulo,double velocidad){
        super(angulo,velocidad);         
    }
    
    public double Altura(){
        double altura=((Math.pow(getVelocidad(), 2) * Math.pow(Math.sin(Math.toRadians(getAngulo())), 2)) / (9.81 * 2));
        return altura;
    }
    
    public String Resultado(){
        return sd.format(Altura());
    }
    
     public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n    Angulo = " +getAngulo()+
                "\n    Velocidad = " +getVelocidad()+
                "\n"+
                "\n Entonces : "+
                "\n Aplicamos la formula de la ALTURA MAXIMA"+ 
                "\n"+ 
                "\n                (Vi^2) * Sen(2α)^2 "+
                "\n    Ymax = ----------------------------"+
                "\n                         2G        "+ 
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es 9,81 "+ 
                "\n"+
                "\n                ("+getVelocidad()+"^2) x Sen(2*"+getAngulo()+")^2 "+
                "\n    Ymax = --------------------------------------"+
                "\n                             2* 9,81        "+ 
                "\n"+
                "\n Calculamos :  "+
                "\n El resultado obtenido es : "+Resultado()+" m"+ 
                 "\n===========================================================================";                  
        }
}

