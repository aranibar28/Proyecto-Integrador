package Clases;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;

public class VelocidadLlegada{
    DecimalFormat sd=new DecimalFormat("#.##");
    
   private double velocidadx;
   private double altura;
    
    public VelocidadLlegada(double velocidadx,double altura){
        this.velocidadx=velocidadx;
        this.altura=altura;
    }
    
    public double Velocidady(){
        double v=sqrt(0+2*9.8*altura);
        
        return v;
    }      
    
    public double VelocidadLL(){
        double re= sqrt(Math.pow(velocidadx, 2)+ Math.pow(Velocidady(), 2));
        return re;  
    }
    
    public String Resultado(){
        return sd.format(VelocidadLL());
    }
    
     public String Procedimiento(){
        return  "\n"
                +" Los datos proporcionados son :"+
                "\n    Velocidadx = " +velocidadx+
                "\n    Altura = " +altura+
                "\n"+
                "\n Entonces : "+
                "\n Hallamos la Velocidad en Y"+ 
                "\n Podemos usar la formula de Velocidad Final"+ 
                "\n     "+
                "\n    Vf = RAIZ ( (Vi^2) +  2*g*h ) "+                 
                "\n"+
                "\n Luego Reemplazamos por nuestros Datos:"+
                "\n Sabemos que la gravedad es 9,81 "+ 
                "\n"+
                "\n    Vy = RAIZ ( ( 0 ^ 2 ) +  2*9.8*"+altura+" ) "+
                "\n    Vy = "+sd.format(Velocidady())+
                "\n"+
                "\n Luego calculamos la V en la parabola :  "+
                "\n"+
                "\n    V = RAIZ ( "+velocidadx+" ^ 2 + "+sd.format(Velocidady())+" ^ 2 )"+ 
                "\n    V = "+Resultado();                    
        }
}
