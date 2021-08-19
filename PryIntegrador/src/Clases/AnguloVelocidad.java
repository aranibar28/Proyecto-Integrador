package Clases;
public class AnguloVelocidad {
    private double angulo;
    private double velocidad;
    
    public AnguloVelocidad(double angulo,double velocidad){
        this.angulo=angulo;    
        this.velocidad=velocidad;      
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
