package boletin_4_1;

public class Boletin_4_1 {

    public static void main(String[] args) {
        
        Coche obxCoche1 = new Coche();
        System.out.println("A velocidade actual é de: " + obxCoche1.getVelocidade() + "km/h");
        obxCoche1.acelerar(24);
        System.out.println("A velocidade actual é de: " + obxCoche1.getVelocidade() + "km/h");
        obxCoche1.frenar(14);
        System.out.println("A velocidade actual é de: " + obxCoche1.getVelocidade() + "km/h");
    }

}