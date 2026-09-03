public class Truck extends Veiculo
{
    private int cargoCap;
    
    public Truck(int passengers, int fuelCap, int mpg, int cargoCap){
        super(passengers,fuelCap,mpg);
        this.cargoCap = cargoCap;
        
    }
    
    public void setCargoCap(int novaCargoCap){
        if(novaCargoCap >= 0 && novaCargoCap < 1000){
            this.cargoCap = novaCargoCap;
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
    
    public int getCargoCap(){
        return cargoCap;
    }
}
