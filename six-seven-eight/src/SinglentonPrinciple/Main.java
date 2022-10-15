package SinglentonPrinciple;

public class Main {
    public static void main(String[] args) {
            
        /*
                Singlenton:     se usa cuando no queremos que una clase no se instancie más de una vez,
                                como por ejemplo una aplicación gráfica.
                                
                Factory:        se usa para estandarizar la creación de instancias de clases que implementan
                                una determinada interfaz, un uso concreto puede ser cuando tenemos muchas clases
                                que implementan una interfaz y con uso de este patron hariamos una única forma
                                crear objetos que implementen la abstracción.
                
                Builder:        se usa cuando se tiene una clase con muchos métodos que requieren el uso constante
                                de setters para su modificación, y con este patrón se crea un forma más cómoda de
                                modificar atributos.
                                
                Prototype       es útil cuando tenemos una clase de la que queremos sacar copias exactas pero sin
                                modificar la original.
                                
        */
            
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
