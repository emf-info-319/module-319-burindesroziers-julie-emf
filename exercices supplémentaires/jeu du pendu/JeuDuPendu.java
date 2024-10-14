import java.util.Scanner;

public class JeuDuPendu {
    public static void main(String[] args) {
        String[] tableauDeMotsATrouver = new String[] { "lapin", "grenouille", "renard", "singe", "cochon", "dragon",
                "serpent", "sanglier", "mouton" }; // mots disponibles
        int index = (int) (Math.random() * (tableauDeMotsATrouver.length + 1)); // choisi le mot
        String motATrouver = tableauDeMotsATrouver[index];

        char[] lettresATrouver = motATrouver.toCharArray(); // transforme le mot en un tableau de char
        char[] lettresRecherche = new char[lettresATrouver.length]; // deuxième tableau de char pour comparer
        for (int i = 0; i < lettresRecherche.length; i++) { // pour remplir le deuxième taleau de tirets
            lettresRecherche[i] = '-';
        }
        boolean reponse=true;// une condition qui, fausse, va arrêter de demander une lettre et finir le jeu

        System.out.println("Voici le mot à trouver :");
        System.out.print(lettresRecherche); // pour afficher le mot en nombre de tirets
        Scanner entree = new Scanner(System.in);

        while (reponse) {
            System.out.print("\nEntrez une lettre en minuscule svp : ");
            char lettre = entree.next().charAt(0);
            for (int i = 0; i < lettresRecherche.length; i++) {
                if (lettre == lettresATrouver[i]) { // compare la lettre entrée à la lettre dans le tableau des lettres à trouver
                    lettresRecherche[i] = lettre; // si la condition est remplie, remplace un tiret par la bonne lettre dans le deuxième tableau
                }
                System.out.print(lettresRecherche[i]);
            }
            String motAChecker = new String(lettresRecherche); // crée un mot à partir des char du deuxième tableau
            boolean question = motAChecker.contains(motATrouver); // question sera vrai si les deux mots des deux tableaux sont les mêmes
            if (question == reponse) { // si les deux booléens sont similaires, cela veut dire que les deux mots sont les mêmes
                System.out.println("\nBRAVO! Le mot à trouver était "+motATrouver);
                reponse = false; // la condition devient fausse, le jeu va s'arrêter
            }
        }
        entree.close();
    }
}
