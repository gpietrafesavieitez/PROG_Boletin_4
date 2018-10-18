package boletin_4_4;

public class Restaurante {
    private int clientes; //Personas
    private float polbo, patacas; //Kilos
    
    public Restaurante(){
        clientes = polbo = patacas = 0;
       
    }
    
    public int clienteStock(float polbo, float patacas){
        this.polbo = polbo;
        this.patacas = patacas;
        
        return (polbo * 3) / 2;
        //Faltan patacas
        
    }
    
    
    
}
