package SinglentonPrinciple;

public class GraphicAplication {
    private boolean running = false;
    private static GraphicAplication uniqueInstace;

    private GraphicAplication() {
    }

    static public GraphicAplication getInstance() {
        if (uniqueInstace == null) {
            uniqueInstace = new GraphicAplication();
        }

        return uniqueInstace;
    }

    public void run() {
        if (running) {
            System.out.println("application is running!");
            return;
        }
        System.out.println("running application!");

        running = true;
    }

    public void stop() {
        if (!running) {
            System.out.println("application is stop!");
            return;
        }
        System.out.println("stop application!");
        running = false;
    }
}
