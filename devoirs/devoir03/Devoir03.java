package devoir03;

public class Devoir03 {
    public static void main(String[] args) {
        int jour=31;
        int mois=12;
        int année=2300;
        int nombreDeJoursAnnée=365;
        if (année%4==0) {
            nombreDeJoursAnnée=366;
            if (année%400!=0) {
                nombreDeJoursAnnée=365;
            }
        }
        //System.out.println(nombreDeJoursAnnée);
        int[] tableauAnnée = new int[nombreDeJoursAnnée];
        for (int i = 0; i < tableauAnnée.length; i++) {
            tableauAnnée[i]= i+1;
        }
    }
}
