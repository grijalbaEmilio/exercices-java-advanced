package SinglentonPrinciple;

public class Main {
    public static void main(String[] args) {
            
        /*
                Singlenton:     se usa cuando no queremos que una clase no se intancie mas de una vez,
                                como por ejemplo una aplicacion grafica.
                                
                Factory:        se usa para estandarizar la creacion de instancias de clases que implementan
                                una determinada intefaz, un uso concreto puede ser cuando tenemos muchas clases
                                que implementan una interfaz y con uso de este patron hariamos una unica forma
                                crear objetos que implementen la abstraccion.
                
                Builder:        se usa cuando se tiene una clase con muchos metodos que requieren el uso constante
                                de setters para su modificacion, y con este patron se crea un aforma mas comoda de 
                                modificar atributos.
                                
                Prototype       es util cuando tenemos una clase de la que queremos sacar copias exactas pero sin
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
