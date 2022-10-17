package SOLIDPriciples;

public class Car {
    private String branch;
    private String model;
    private double velMax;

    public Car(String branch, String model, double velMax) {
        this.branch = branch;
        this.model = model;
        this.velMax = velMax;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public void start(){
        System.out.println("starting car...");
    }

    public void stop(){
        System.out.println("stopping car...");
    }
    
}
