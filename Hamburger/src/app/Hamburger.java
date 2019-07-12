package app;

public class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionalName;
    private double additionalPrice;
    
    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;
    
    

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.additionalName = name;
        this.additionalPrice = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.additional4Name = name;
        this.additional4Price = price;
    }

    public double itemsizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " +
                           " with " + this.meat + "price is " + this.price);

        if(this.additionalName != null){
            hamburgerPrice += this.additionalPrice;
            System.out.println("Added " + this.additionalName + " for an extra " + this.additionalPrice);
        }

        if(this.additional2Name != null){
            hamburgerPrice += this.additional2Price;
            System.out.println("Added " + this.additional2Name + " for an extra " + this.additional2Price);
        }

        if(this.additional3Name != null){
            hamburgerPrice += this.additional3Price;
            System.out.println("Added " + this.additional3Name + " for an extra " + this.additional3Price);
        }

        if(this.additional4Name != null){
            hamburgerPrice += this.additional4Price;
            System.out.println("Added " + this.additional4Name + " for an extra " + this.additional4Price);
        }

        return hamburgerPrice;
    }


}