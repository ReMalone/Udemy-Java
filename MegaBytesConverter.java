public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes;
        int remainKilo;
        
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
         }else{
            megabytes = kiloBytes / 1024;
            remainKilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainKilo + " KB");
         } 
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}