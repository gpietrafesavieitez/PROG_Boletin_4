package boletin_4_4;

public class Restaurante {
    private int clientes, polbo, patacas;
    
    public Restaurante() {
        clientes = polbo = patacas = 0;
        
    }
    
    public int clienteStock(int polbo, int patacas) {
        this.polbo += polbo;
        this.patacas += patacas;
        return ((this.polbo + this.patacas) * 3) / 3;
        
    }
    
    public void engadirPolbo(int x) {
        this.polbo += x;      
        
    }
    
    public void engadirPatacas(int x) {
        this.patacas += x;
        
    }
    
    public void amosarPolbo() {
        System.out.println("- " + polbo + " kg de polbo.");
        
    }
    
    public void amosarPatacas() {
        System.out.println("- " + patacas + " kg de patacas.");
        
    }
    
}
