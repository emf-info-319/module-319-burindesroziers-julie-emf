public class ExerciceTableaux2 {
    public static final int MIN=1;
    public static final int MAX=6;
    public static void main(String[] args) {
        int[] monTableau= new int[10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i]=( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
            System.out.println("Cellule "+i+" : "+monTableau[i]);
        }
    }
}
