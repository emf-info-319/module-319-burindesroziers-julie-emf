import java.util.Random;

public class ExercicesMethodesTableaux {
    public static void main(String[] args) {
        int[] tableau1 = créerTableauEntiers(5);
        int[] tableau2 = remplirValeursFixes(tableau1, 3);
        int[] tableau3 = remplirValeursAléatoires(tableau1);
        int taille = déterminerTaille(tableau1);
        afficherTableau(tableau3);
        int minimum3 = minimumTableau(tableau3);
        int maximum3 = maximumTableau(tableau3);
    }
    public static int[] créerTableauEntiers(int nombreCellules){
        int[] tableau = new int[nombreCellules];
        return tableau;
    }
    public static int[] remplirValeursFixes(int[] tableau, int valeurFixe){
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeurFixe;
        }
        return tableau;
    }
    public static int[] remplirValeursAléatoires(int[] tableau){
        for (int i = 0; i < tableau.length; i++) {
            Random nombre = new Random();
            tableau[i] = nombre.nextInt(100);
        }
        return tableau;
    }
    public static int déterminerTaille(int[] tableau){
        int tailleDuTableau = tableau.length;
        return tailleDuTableau;
    }
    public static void afficherTableau(int[]tableau){
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]+" ");
        }
        System.out.println(" ");
    }
    public static int minimumTableau(int[]tableau){
        int minimum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (minimum>=tableau[i]){
                minimum = tableau[i];
            }
        }
        return minimum;
    }
    public static int maximumTableau(int[]tableau){
        int maximum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (maximum<=tableau[i]){
                maximum = tableau[i];
            }
        }
        return maximum;
    }
}
