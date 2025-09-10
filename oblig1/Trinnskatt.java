import java.util.Scanner;

public class Trinnskatt {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("BruttoInntekt: ");
        int lonn = Integer.parseInt(input.nextLine());
        
        double skatt = 0;
        double restLonn;
        double lonnForTrinn;
        
        int startTrinn1 = 217401;
        int startTrinn2 = 306051;
        int startTrinn3 = 697151;
        int startTrinn4 = 942901;
        int startTrinn5 = 1410751;
        
        double skattTrinn1 = 0.017;
        double skattTrinn2 = 0.04;
        double skattTrinn3 = 0.137;
        double skattTrinn4 = 0.167;
        double skattTrinn5 = 0.177;
        
        restLonn = lonn;
        
        if (restLonn >= startTrinn5) {
            lonnForTrinn = (restLonn - startTrinn5);
            skatt = skattTrinn5 * lonnForTrinn;
            restLonn = restLonn - lonnForTrinn;
        }
        
        if (restLonn >= startTrinn4) {
            lonnForTrinn = (restLonn - startTrinn4);
            skatt = skatt + (skattTrinn4 * lonnForTrinn);
            restLonn = restLonn - lonnForTrinn;
        }
        
        if (restLonn >= startTrinn3) {
            lonnForTrinn = (restLonn - startTrinn3);
            skatt = skatt + (skattTrinn3 * lonnForTrinn);
            restLonn = restLonn - lonnForTrinn;
        }
        
        if (restLonn >= startTrinn2) {
            lonnForTrinn = (restLonn - startTrinn2);
            skatt = skatt + (skattTrinn2 * lonnForTrinn);
            restLonn = restLonn - lonnForTrinn;
        }
        
        if (restLonn >= startTrinn1) {
            lonnForTrinn = (restLonn - startTrinn1);
            skatt = skatt + (skattTrinn1 * lonnForTrinn);
            restLonn = restLonn - lonnForTrinn;
        }
        
        System.out.println("Skatt: " + skatt);
        
        input.close();
    }
    
}