import java.util.Scanner;

public class KarakterSkalaMedMetoder {
    // Variabler
    private static final int ANTALL_STUDENTER = 10;
    private static final int MIN_POENG = 0;
    private static final int MAX_POENG = 100;

    private static final int START_A = 90;
    private static final int START_B = 80;
    private static final int START_C = 60;
    private static final int START_D = 50;
    private static final int START_E = 40;
    private static final int START_F = 0;

    private static final int SLUTT_A = 100;
    private static final int SLUTT_B = 89;
    private static final int SLUTT_C = 79;
    private static final int SLUTT_D = 59;
    private static final int SLUTT_E = 49;
    private static final int SLUTT_F = 39;

    private static int[] poeng = new int[ANTALL_STUDENTER];
    private static char[] karakter = new char[ANTALL_STUDENTER];

    public static void main(String[] args){

        // Les inn verdier for poeng
        lesPoeng(poeng);
        beregnKarakter(poeng, karakter);
        skrivUtKarakterer(karakter);
            
    }
    
    // Metode: lesPoeng
    private static void lesPoeng(int[] poeng) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < poeng.length; i++) { 
         // Les inn verdi (inntil OK verdi)
            do {
                // Les inn verdi
                System.out.print("Poeng for student " + (i+1) + ": ");
                poeng[i] = Integer.parseInt(input.nextLine());

                // Skjekker at verdi er lovlig ( hvis ikke skriv feilmelding)
                if (poeng[i] > MAX_POENG || poeng[i] < MIN_POENG) {
                    System.out.println("Ugyldig poengsum, må være mellom "+ MIN_POENG +" og "+ MAX_POENG);
                }
            } while (poeng[i] > MAX_POENG || poeng[i] < MIN_POENG);
        }
    }

    // Metode: beregnKarakter
    private static void beregnKarakter(int[] poeng, char[] karakter) {
         // Les inn verdi fra bruker og berengn karakter
        for (int i=0;i<poeng.length;i++) {

            // Beregn karakter for student
            if (poeng[i] >= START_A && poeng[i] <= SLUTT_A) {
                karakter[i] = 'A';
            } else if  (poeng[i] >= START_B && poeng[i] <= SLUTT_B) {
                karakter[i] = 'B';
            } else if (poeng[i] >= START_C && poeng[i] <= SLUTT_C) {
                karakter[i] = 'C';
            } else if  (poeng[i] >= START_D && poeng[i] <= SLUTT_D) {
                karakter[i] = 'D';
            } else if  (poeng[i] >= START_E && poeng[i] <= SLUTT_E) {
                karakter[i] = 'E';
            } else if  (poeng[i] >= START_F && poeng[i] <= SLUTT_F){
                karakter[i] = 'F';
            } else {
                System.out.println("FEIL! Dette skal ikke skje.");
            }
            
        } 
    }  

    // Metode: skrivUtKarakter
    private static void skrivUtKarakterer(char[] karakterer){
        // Heading
        System.out.println("");
        System.out.println("Karakterliste: ");

        // Skriv ut karakter
        for (int i=0;i<karakterer.length;i++) {
            System.out.println("Karakter for student " + (i+1) + ":" + karakter[i]);
        }
    }

}
