package SOLIDPriciples;

public class Main {
    public static void main(String[] args) {

        Car oHibrydCar = new Car("Tesla", "X", 150);

        // TODO: remove folow commet
        // HibrydCar oHibrydCar = new HibrydCar("Tesla", "X", 150, 100);

        System.out.println();
        System.out.println("branch: " + oHibrydCar.getBranch());
        System.out.println("model: " + oHibrydCar.getModel());
        System.out.println("velocity max: " + oHibrydCar.getVelMax());
        System.out.println();
    }
}
