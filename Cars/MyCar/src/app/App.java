package app;

public class App {
    public static void main(String[] args) throws Exception {
    
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}