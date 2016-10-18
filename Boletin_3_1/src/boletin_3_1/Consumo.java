package boletin_3_1;

public class Consumo {
    //declarar atributos
    private float kilometros,litros,velocidadMed,precioGas,tiempo;
    //contructores
    public Consumo(){
   kilometros=0;
   litros=0;
   velocidadMed=0;
   precioGas=0;
    }
   public Consumo (float km,float l,float v,float p){
   kilometros=km;
   litros=l;
   velocidadMed=v;
   precioGas=p;
   }
   //metodo de acceso
   public float getTiempo(){
    return (kilometros/velocidadMed);
   }
   
   public float getConsumoMedio(){
        return ((litros/kilometros)*100);
   }
   
   public float getConsumoEuros(){
       return (litros*precioGas);
       
   }
   public void setKilometros(float km){
       km = kilometros;
   }
   public void setLitros(float l){
       l = litros;
   }
   public void setVelocidadMedia(float v){
       v = velocidadMed;
   }
   public void setPrecioGas(float p){
       p = precioGas;
   }
   public float getVelocidadMedia(){
       return velocidadMed;
   }
}