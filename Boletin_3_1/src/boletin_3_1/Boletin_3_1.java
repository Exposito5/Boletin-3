package boletin_3_1;

import javax.swing.JOptionPane;

public class Boletin_3_1 {

    public static void main(String[] args) {
    Consumo Cos1 = new Consumo();
    Cos1.setLitros(50f);
    Cos1.setPrecioGas(1.57f);
    
    Consumo Cos2 = new Consumo(250f,9.43f,83f,0.97f);
    float consumoMedio = Cos2.getConsumoMedio();
        
        JOptionPane.showMessageDialog(null,"El consumo medio durante el viaje es de " + (consumoMedio) + " litros por cada 100 kilometro");
        
        float velocidadMedia = Cos2.getVelocidadMedia();
        
        JOptionPane.showMessageDialog(null,"La velocidad media durante el trayecto es de "+(velocidadMedia)+" kilometros por hora");
    }
    
}
