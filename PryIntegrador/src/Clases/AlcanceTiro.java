package Clases;
import java.text.DecimalFormat;
public class AlcanceTiro extends AnguloVelocidad {
       DecimalFormat sd=new DecimalFormat("#.##");
    public AlcanceTiro(double angulo,double velocidad){
        super(angulo,velocidad);       
    }
    
    public double AlcanceMaximo(){
        double AM=((Math.pow(getVelocidad(), 2) * (Math.sin(Math.toRadians(getAngulo() * 2)))) / 9.81);
        return AM;
    }
    
    public String Resultado(){
        return sd.format(AlcanceMaximo());
    }
    
     public String Procedimiento(){
        return  "\n==========================================================================="+
                "\n Los datos proporcionados son :"+
                "\n    Angulo = " +getAngulo()+
                "\n    Velocidad = " +getVelocidad()+
                "\n"+
                "\n Entonces : "+
                "\n Aplicamos la formula del ALCANCE MAXIMO"+ 
                "\n"+ 
                "\n                  (Vi^2) * Sen(2α) "+
                "\n    Xmax = ----------------------------"+
                "\n                            G        "+ 
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es 9,81 "+ 
                "\n"+
                "\n                 ("+getVelocidad()+"^2) x Sen(2*"+getAngulo()+") "+
                "\n    Xmax = ------------------------------------"+
                "\n                             9,81        "+ 
                "\n"+
                "\n Calculamos :  "+
                "\n El resultado obtenido es : "+Resultado()+" m"+
                "\n===========================================================================";                
        }
}
