package boletin_4_3;
import java.lang.Math;

public class Circulo {
    
    private final double PI = 3.14159265359;
    private double radio;
    
    public Circulo() {
        radio = 0;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
        
    }
    
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
        
    }
    
    public double calcularLonxitude() {
        return 2 * PI * radio;
        
    }
    
}
