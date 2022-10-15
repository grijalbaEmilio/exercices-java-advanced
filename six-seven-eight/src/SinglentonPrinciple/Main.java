package SinglentonPrinciple;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        GraphicAplication app = GraphicAplication.getInstance();
        GraphicAplication app2 = GraphicAplication.getInstance();

        System.out.print("execute run app --> ");
        app.run();
        System.out.print("execute run app2 --> ");
        app2.run();

        System.out.println("memory position of app  --> "+app);
        System.out.println("memory position of app2 --> "+app2);

        System.out.println("app memory position and app2 memory position "
                            +(app.equals(app2) ? "" : "not")+" is equals");

        System.out.println();   

    }
}
