package boletin_4_4;

public class Boletin_4_4 {

    public static void main(String[] args) {
        Restaurante obxRestaurante = new Restaurante();
        obxRestaurante.amosarPolbo();
        obxRestaurante.amosarPatacas();
        obxRestaurante.engadirPolbo(2);
        obxRestaurante.engadirPatacas(1);
        obxRestaurante.amosarPolbo();
        obxRestaurante.amosarPatacas();
        System.out.println("- Clientes máximos para el stock actual: " + obxRestaurante.clienteStock(0, 0));
        System.out.println("- Clientes máximos para el stock actual: " + obxRestaurante.clienteStock(2, 1));
        
    }
    
}
