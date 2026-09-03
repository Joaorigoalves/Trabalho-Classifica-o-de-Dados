
public class Veiculo
{
    private int passengers;
    private int fuelCap;
    private int mpg;
    
    public Veiculo(int passengers, int fuelCap, int mpg){
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }
    
    public void setPassengers(int novoPassengers){
        if(novoPassengers >= 0 && novoPassengers < 100){
            this.passengers = novoPassengers;
        }
        else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public int getPassengers(){
        return passengers;
    }
    
    public void setFuelCap(int novoFuel){
        if(novoFuel >= 0 && novoFuel < 200){
            this.fuelCap = novoFuel;
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
    
    public int getFuel(){
        return fuelCap;
    }
    
    public void setMpg(int novoMpg){
        if(novoMpg >= 0 && novoMpg < 200){
            this.mpg = novoMpg;
        }
        else{
            System.out.println("Valor Inválido!");
        }
        
    }
    
    public int getMpg(){
        return mpg;
    }
    
    
}