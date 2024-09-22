package devoir03;

import java.util.Scanner;

public class Devoir03 {
    public static void main(String[] args) {
        Scanner scanneur = new Scanner(System.in);
        
        int année;
        int mois;
        int jour;

        do {
            System.out.println("Entrer année :");
            année = scanneur.nextInt();
        } while (année<0 || année>9999);

        boolean bisextile = false;
        if (année % 4 == 0) {
            bisextile = true;
            if (année % 400 != 0) {
                bisextile = false;
            }
        }

        do {
            System.out.println("Entrer mois :");
            mois = scanneur.nextInt();
        } while (mois<0 || mois>12);       

        int[] tableauMois = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (bisextile) {
            tableauMois[1] = 29;
        }

        int maxJourMois = tableauMois[mois-1];

        do {
            System.out.println("Entrer jour :");
            jour = scanneur.nextInt();  
        } while (jour<0 || jour>maxJourMois); 

        int nombreJour = 0;
        for (int i = 0; i < (mois - 1); i++) {
            nombreJour += tableauMois[i];
        }

        nombreJour += jour;
        System.out.println("Le " + jour + "/" + mois + "/" + année + " est le jour " + nombreJour + " de l'An.");
    }
}
