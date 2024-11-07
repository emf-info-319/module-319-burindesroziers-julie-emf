import java.util.Random;

public class ExercicesMethodesTableaux {
    public static final int MIN = 1;
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[] tableau = créerTableauEntiers(50);
        System.out.println("Le tableau a une taille de " + tableau.length + " cellules.\n");
        remplirValeursAléatoires(tableau);
        System.out.println("Contenu du tableau aléatoire :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "] = " + tableau[i]);
        }
        System.out.println("La valeur min trouvée = " + minimumTableau(tableau));
        System.out.println("La valeur max trouvée = " + maximumTableau(tableau) + "\n");
        remplacerValeur(tableau, 12, 5);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du >tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "] = " + tableau[i]);
        }
        System.out.println("\nLa somme des cellules du tableau = " + sommeTableau(tableau));
        System.out.println("La moyenne des cellules du tableau = " + moyenneTableau(tableau));
        System.out.println(
                "La valeur 13 a été trouvée à la 1ère position N°" + rechercherPremiereOccurrence(tableau, 13));
        System.out.println(
                "La valeur 13 a été trouvée à la dernière position N°" + rechercherDerniereOccurrence(tableau, 13));
    }

    public static int[] créerTableauEntiers(int nombreCellules) {
        int[] tableau = new int[nombreCellules];
        return tableau;
    }

    public static int[] remplirValeursFixes(int[] tableau, int valeurFixe) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeurFixe;
        }
        return tableau;
    }

    public static int[] remplirValeursAléatoires(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            Random nombre = new Random();
            tableau[i] = nombre.nextInt(20);
        }
        return tableau;
    }

    public static int[] remplirValeursAléatoires2(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (MAX - MIN + 1) - MIN);
        }
        return tableau;
    }

    public static int déterminerTaille(int[] tableau) {
        int tailleDuTableau = tableau.length;
        return tailleDuTableau;
    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(" ");
    }

    public static int minimumTableau(int[] tableau) {
        int minimum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (minimum >= tableau[i]) {
                minimum = tableau[i];
            }
        }
        return minimum; // on peut utiliser Math.min
    }

    public static int maximumTableau(int[] tableau) {
        int maximum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (maximum <= tableau[i]) {
                maximum = tableau[i];
            }
        }
        return maximum; // on peut utiliser Math.max
    }

    // Compter la fréquence d'un nombre dans un tableau
    public static int compter(int[] tableau, int valeur) {
        int fréquence = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (valeur == tableau[i]) {
                fréquence += 1;
            }
        }
        return fréquence;
    }

    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    public static double moyenneTableau(int[] tableau) {
        double moyenne = (double) sommeTableau(tableau) / tableau.length;
        return moyenne;
    }

    public static int[] remplacerValeur(int[] tableau, int valeurRechercher, int valeurRemplacement) {
        for (int i = 0; i < tableau.length; i++) {
            if (valeurRechercher == tableau[i]) {
                tableau[i] = valeurRemplacement;
            }
        }
        return tableau;
    }

    public static int rechercherPremiereOccurrence(int[] tableau, int valeurRechercher) {
        int position = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRechercher) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static int rechercherDerniereOccurrence(int[] tableau, int valeurRechercher) {
        int position = -1;
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeurRechercher) {
                position = i;
                break;
            }
        }
        return position;
    }
}
