package boletin_4_2;

public class Satelite {
    
    private double meridiano, paralelo, distanciaTerra;
    
    public Satelite() {
        meridiano = paralelo = distanciaTerra = 0;
        
    }
    
    public Satelite(double meridiano, double paralelo, double distanciaTerra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTerra = distanciaTerra;
        
    }
    
    public void verPosicion() {
        System.out.println ("O satelite atopase no paralelo " + paralelo + " meridiano " + meridiano + " a unha distancia da Terra " + distanciaTerra);
        
    }
    
    
}
