public class ExerciceTableaux3 {
    public static final int MIN=1;
    public static final int MAX=6;
    public static void main(String[] args) {
        double sommeDesNotes=0;
        int[] monTableau= new int[10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i]=( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
            //System.out.println("Cellule "+i+" : "+monTableau[i]);
            sommeDesNotes+=monTableau[i];
        }
        //System.out.println(sommeDesNotes);
        double moyenneDeClasse=sommeDesNotes/monTableau.length;
        System.out.println(moyenneDeClasse);
    }
}
