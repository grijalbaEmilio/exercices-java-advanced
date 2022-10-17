package SOLIDPriciples;


public class HibrydCar extends Car{

    private int batery;
    private int gasLevel;

    public HibrydCar(String branch, String model, double velMax, int batery) {
        super(branch, model, velMax);    
        this.batery = batery;
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        if( batery < 0 || batery > 100){
            throw new RuntimeException(" gas level greater 0 and minor be 100");
        }
        this.batery = batery;
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