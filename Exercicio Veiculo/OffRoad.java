public class OffRoad extends Veiculo
{
    private float groundClearance;
    
    public OffRoad(int passengers, int fuelCap, int mpg, float groundClearance){
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }
    
    public void setGround(float novoGround){
        if(novoGround >= 0.0f && novoGround < 50.0f){
            this.groundClearance = novoGround;
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
    
    public float getGround(){
        return groundClearance;
    }
}