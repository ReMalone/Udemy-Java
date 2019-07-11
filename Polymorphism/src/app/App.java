package app;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }

}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over the Earth";
    }
}

class Terminator extends Movie{
    public Terminator(){
        super("Terminator");
    }

    @Override
    public String plot(){
        return "Machine comes from the future to kill future leader";
    }

}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override  
    public String plot(){
        return "It's Star Wars you know the plot";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

    //No override plot method
}


public class App {
    public static void main(String[] args) {
        for(int i=1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + 
                                movie.getName() + "\n" + 
                                "Plot: " + movie.plot() + "\n");
        }

    
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Terminator();
            
            case 4:
                return new StarWars();
            
            case 5:
                return new Forgetable();
        }
        return null;

    }

}