package boletin_4_3;

public class Boletin_4_3 {

    public static void main(String[] args) {
        Circulo obxCirculo1 = new Circulo();
        obxCirculo1.calcularArea();
        obxCirculo1.calcularLonxitude();
        
        Circulo obxCirculo2 = new Circulo(2.62);
        System.out.println("Área: " + obxCirculo2.calcularArea() + " unidades.\nLongitud: " + obxCirculo2.calcularLonxitude() + " unidades.");
        
    }
    
}
