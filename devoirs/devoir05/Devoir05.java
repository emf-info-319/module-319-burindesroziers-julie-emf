package devoir05;

import java.util.Scanner;

public class Devoir05 {
    public static void main(String[] args) {
        /*Le programme choisit un nombre P, entre 1 et 100.
         Le programme demande au joueur d'entrer un nombre. Le joueur entre un nombre J.
         Le programme va écrire "trop petit" si J<P, "trop grand" si J>P (i.e. tant que le nombre J n'est pas égal au nombre P) ou "Bravo, trouvé !" si J=P.
         Dans le 1er et 2e cas, le programme demande d'entrer un nombre, le joueur devra re-entrer un nombre.
        */
        int nbreP = (int)( Math.random() * ( 100 - 1 + 1 )) + 1;
        
        Scanner entree = new Scanner(System.in);
        System.out.print("Jouons à un jeu ! \nTrouvez un nombre entre 1 et 100 : ");
        int nbreJ = entree.nextInt();

        while (nbreJ!=nbreP) {
            if (nbreJ<nbreP) {
                System.out.print("Trop petit ! \nEntrez à nouveau un nombre : ");
            }else {
                System.out.print("Trop grand ! \nEntrez à nouveau un nombre : ");
            }
            nbreJ = entree.nextInt();
        }
        System.out.println("Bravo, trouvé ! C'était bien "+nbreP);
        entree.close();
    }
}
