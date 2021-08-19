package Clases;
import java.text.DecimalFormat;
public class VelocidadFinalTiro extends AnguloVelocidad {
    DecimalFormat sd=new DecimalFormat("#.##");
        
    public VelocidadFinalTiro(double angulo,double velocidad){
        super(angulo,velocidad);            
    }
    
    public double Velocidadx(){
        double vx=(getVelocidad() * Math.cos(Math.toRadians(getAngulo())));
        return vx;
    }
    
    public double Velocidady(){
        double vy=(getVelocidad() * Math.sin(Math.toRadians(getAngulo())));
        return vy;
    }
  
    /* En el cambio en el eje Y sí hay velocidad final distinta a la velocidad inicial, 
    esta actúa con la aceleración de G (gravedad = -9,81 pues va "hacia abajo en el eje" */
     public double VelocidadyMenosGravedad(){
        double vy=(getVelocidad() * Math.sin(Math.toRadians(getAngulo()))-9.81);
        return vy;
    }
      
    public double VelocidadFinal(){
        double Velocidadf = (Math.sqrt(Math.pow(Velocidadx(), 2) + Math.pow(VelocidadyMenosGravedad(), 2)));
        return Velocidadf;
    }
       
    public String Resultado(){
        return sd.format(VelocidadFinal());
    }
    
     public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n   Angulo = " +getAngulo()+
                "\n   Velocidad = " +getVelocidad()+
                "\n"+
                "\n Entonces : "+
                "\n Aplicamos la formula de la VELOCIDAD FINAL"+ 
                "\n"+ 
                "\n    Vfinal =  RAIZ(Vy^2 + Vx^2 - G) "+                  
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es -9,81 "+ 
                "\n"+
                "\n     Vfinal = RAIZ("+sd.format(Velocidadx())+"^2 + ("+sd.format(Velocidady())+"^2  -  9,81 ))"+
                "\n"+
                "\n Calculamos :  "+
                "\n El resultado obtenido es : "+Resultado()+" m/s"+ 
                 "\n===========================================================================";  
                
        }
}
