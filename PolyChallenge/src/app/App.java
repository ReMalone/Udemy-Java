package app;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Mistubishi extends Car{
    public Mistubishi(int cylinders, String name){
        super(cylinders, name);
    }

    //Easy way to get name
    //return getClass().getSimpleName() + " -> startEngine()";
    //Apply to rest
    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }

}

class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }

}



public class App {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mistubishi mistubishi = new Mistubishi(6, "Eclipse");
        System.out.println(mistubishi.startEngine());
        System.out.println(mistubishi.accelerate());
        System.out.println(mistubishi.brake());

        Ford ford = new Ford(6, "Focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        

    }
}