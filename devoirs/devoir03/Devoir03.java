package devoir03;

public class Devoir03 {
    public static void main(String[] args) {
        int jour=31;
        int mois=12;
        int année=2300;

        boolean bisextile=false;
        if (année%4==0) {
            bisextile=true;
            if (année%400!=0) {
                bisextile=false;
            }
        }
        int[] tableauMois = new int[12]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (bisextile){
            tableauMois[1]=29;
        }

    
    }
}
