public class BeregnFakultet {
    public static void main(String[] args) {

        fakultet(6);
        
    }

    //Metode fakultet
    private static void fakultet(int n){
        int fak = 1;

        for (int i = 1; i <= n; i++){
            fak = fak * i;
        }

        System.out.println("Fakultet av n = "+ n + " blir " + fak);
        
        
    }
}
