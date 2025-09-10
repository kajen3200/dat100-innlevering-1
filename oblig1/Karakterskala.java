import java.util.Scanner;

public class Karakterskala2 {
    
    public static void main(String[] args){
        // Variabler
        Scanner input = new Scanner(System.in);
        
        int antallStudenter = 10;
        int[] poeng = new int[antallStudenter];
        char[] karakter = new char[antallStudenter];
        
        int minPoeng = 0;
        int maxPoeng = 100;

        int startA = 90;
        int startB = 80;
        int startC = 60;
        int startD = 50;
        int startE = 40;
        int startF = 0;
        
        int sluttA = 100;
        int sluttB = 89;
        int sluttC = 79;
        int sluttD = 59;
        int sluttE = 49;
        int sluttF = 39;
        
        // Les inn verdi fra bruker og berengn karakter
        for (int i=0;i<antallStudenter;i++) {

            // Les inn verdi (inntil OK verdi)
            do {
                // Les inn verdi
                System.out.print("Poeng for student " + (i+1) + ": ");
                poeng[i] = Integer.parseInt(input.nextLine());

                // Skjekker at verdi er lovlig ( hvis ikke skriv feilmelding)
                if (poeng[i] > maxPoeng || poeng[i] < minPoeng) {
                    System.out.println("Ugyldig poengsum, må være mellom "+ minPoeng +" og "+ maxPoeng);
                }
            } while (poeng[i] > maxPoeng || poeng[i] < minPoeng);
            
            
            

            // Beregn karakter for student
            if (poeng[i] >= startA && poeng[i] <= sluttA) {
                karakter[i] = 'A';
            } else if  (poeng[i] >= startB && poeng[i] <= sluttB) {
                karakter[i] = 'B';
            } else if (poeng[i] >= startC && poeng[i] <= sluttC) {
                karakter[i] = 'C';
            } else if  (poeng[i] >= startD && poeng[i] <= sluttD) {
                karakter[i] = 'D';
            } else if  (poeng[i] >= startE && poeng[i] <= sluttE) {
                karakter[i] = 'E';
            } else if  (poeng[i] >= startF && poeng[i] <= sluttF){
                karakter[i] = 'F';
            } else {
                System.out.println("FEIL! Dette skal ikke skje.");
            }
            
        } 

        // Heading
        System.out.println("");
        System.out.println("Karakterliste: ");

        // Skriv ut karakter
        for (int i=0;i<antallStudenter;i++) {
            System.out.println("Karakter for student " + (i+1) + ":" + karakter[i]);
        }
            
        
    }
}