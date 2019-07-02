package app;

public class App {
    public static void main(String[] args)  {
        Player player = new Player();
        player.name = "Robert";
        player.health = 20;
        player.weapon = "Sword";

       int damage = 10;
         player.lostHealth(damage);
       System.out.println("Remaining health = " + player.healthRemaning());

        damage = 11;
        player.health = 200;
         player.lostHealth(damage);
         System.out.println("Remaining health = " + player.healthRemaning());

        EnhancedPlayer players = new EnhancedPlayer("Robert", 200, "Sword");
        System.out.println("Initial Health is " + players.getHealth());

    }

}