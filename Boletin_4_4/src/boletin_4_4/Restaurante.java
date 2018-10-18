package boletin_4_4;

public class Restaurante {
    private int clientes, polbo, patacas;
    
    public Restaurante(){
        clientes = polbo = patacas = 0;
       
    }
    
    public int clienteStock(int polbo, int patacas){
        int total;
        total = ((polbo + patacas) * 3) / 3;

        return total;
        
    }
    
}
