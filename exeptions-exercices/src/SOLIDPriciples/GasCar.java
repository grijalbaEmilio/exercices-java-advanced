package SOLIDPriciples;

public class GasCar extends Car{

    private int gasLevel;

    public GasCar(String branch, String model, double velMax) {
        super(branch, model, velMax);
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        if( gasLevel < 0 || gasLevel > 100){
            throw new RuntimeException(" gas level greater 0 and minor be 100");
        }
        this.gasLevel = gasLevel;
    }

}