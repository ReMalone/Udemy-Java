public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number){
        
        int even = 0;
        int num;
        
        if(number < 0){
            return -1;
        }
        for(num = number; num>0; num = num/10){
            int r = num%10;
            if(r%2 == 0){
                even = even + r;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        getEvenDigitSum(123456789); //return 20
        getEvenDigitSum(252);       //return 4 
        getEvenDigitSum(-22);       //return -1
    }
      
}