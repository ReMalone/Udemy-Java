public class EqualSumChecker {
    
    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum){
        
        if(firstNum + secondNum == thirdNum){
            return true;
         } else {
            return false;
         }
    }
    public static void main(String[] args) {
        hasEqualSum(1, 1, 1); //return false
        hasEqualSum(1, 1, 2); //return true
        hasEqualSum(1, -1, 0);//return true
    }
}