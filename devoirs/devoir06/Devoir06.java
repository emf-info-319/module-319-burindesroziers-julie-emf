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
        rechercheValeur(tableau, VALEUR_RECHERCHEE);

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
                System.out.println("Le nombre ["+valeurRecherchee+"] est à la position ["+index+"] du tableau");
            }
        }
        if (index==-1) {
            System.out.println("Le nombre ["+valeurRecherchee+"] est à la position ["+index+"] du tableau");
        }
        return index;
    }
}
/*Exemple lorsqu'il y a plus d'une occurence:
Tableau [0] = [20]
Tableau [1] = [2]
Tableau [2] = [30]
Tableau [3] = [30]
Tableau [4] = [32]
Tableau [5] = [7]
Tableau [6] = [21]
Tableau [7] = [16]
Tableau [8] = [2]
Tableau [9] = [40]
Tableau [10] = [26]
Tableau [11] = [36]
Tableau [12] = [35]
Tableau [13] = [17]
Tableau [14] = [32]
Tableau [15] = [20]
Tableau [16] = [23]
Tableau [17] = [27]
Tableau [18] = [7]
Tableau [19] = [47]
La plus petite valeur trouvée est : 2
La plus grande valeur trouvée est : 47
Le nombre [7] est à la position [5] du tableau
Le nombre [7] est à la position [18] du tableau
 */