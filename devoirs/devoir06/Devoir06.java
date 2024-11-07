public class Devoir06 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;
    public static void main(String[] args) {
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau ["+i+"] = ["+tableau[i]+"]");
        }
        System.out.println("La plus petite valeur trouvée est : "+rechercheMin(tableau));
        System.out.println("La plus grande valeur trouvée est : "+rechercheMax(tableau));
        System.out.println("Le nombre ["+VALEUR_RECHERCHEE+"] figure à la position ["+rechercheValeur(tableau, VALEUR_RECHERCHEE)+"] du tableau");

    }
    public static int[] genereTableau(int taille, int min, int max){
        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i]= (int)(Math.random()*(max-min+1))+min;
        }
        return tableau;
    }
    public static int rechercheMin(int[] tableau){
        int minimum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (minimum>=tableau[i]){
                minimum = tableau[i];
            }
        }
        return minimum;
    }
    public static int rechercheMax(int[] tableau){
        int maximum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (maximum<=tableau[i]){
                maximum = tableau[i];
            }
        }
        return maximum;
    }
    public static int rechercheValeur(int[] tableau, int valeurRecherchee){
        int index = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i]==valeurRecherchee) {
                index=i;
                break;
            }
        }
        return index;
    }
}