package SOLIDPriciples;

public class ElectricCar extends Car{

    private int batery;

    public ElectricCar(String branch, String model, double velMax) {
        super(branch, model, velMax);
        //TODO Auto-generated constructor stub
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
    
}
