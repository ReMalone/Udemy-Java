
public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }      
    }
    
    public static void printConversion(double kilometersPerHour){       
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");  
        } else {
             long milesPerHour = toMilesPerHour(kilometersPerHour);
             System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
           }
    }
 
    public static void main(String[] args) {
        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("rounded = " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.5));
        int sum = 45;
        int count = 10;

        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);
        
    }


 
}