package app;

public class Player{
    public String name;
    public int health;
    public String weapon;
    
    public void lostHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for for the player
        }
    }

    public int healthRemaning(){
        return this.health;
    }

    

}