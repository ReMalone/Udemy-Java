public class NumberPalindrome {
 
    public static boolean isPalindrome(int number){
        int reverse = 0;
        
        if(number < 0){
            number *= -1;
        }
        int num = number;
        while(num > 0){
        int lastDigit = num % 10;
        reverse *= 10;
        reverse += lastDigit;
        num /= 10;
        }
        System.out.println(number);
        System.out.println(reverse);
        
        if(reverse == number){
            return true;
        } else {
            return false;
        }
    } 

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
    }
 
}