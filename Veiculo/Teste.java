public class Teste
{
    public static void main(String args[]){
        Truck caminhao = new Truck(2, 50, 10, 400);
        
        OffRoad ofr = new OffRoad(4,30, 10, 4);
        
        System.out.println("Passageiros caminhão: " + caminhao.getPassengers());
        
        System.out.println(" Combustivel caminhao: " + caminhao.getFuel());
        
        System.out.println(" MPG caminhao: " + caminhao.getMpg());
        
        System.out.println(" Capacidade de carga caminhao: " + caminhao.getCargoCap());
        
        System.out.println(" Passageiros OffRoad: " + ofr.getPassengers());
        
        System.out.println("Combustivel OffRoad: " + ofr.getFuel());
        
        System.out.println("MPG OffRoad: " + ofr.getMpg());
        
        System.out.println("groundClearance Offroad: " + ofr.getGround());        
    }
}