/**
 * AdditionDe2Tableaux
 */
public class AdditionDe2Tableaux {

    public static void main(String[] args) {
        int[] tableau1 = new int[]{4,8,7,9,1,5,4,6};
        int[] tableau2 = new int[]{7,6,5,2,1,3,7,4};
        int[] resultat = new int[8];
        System.out.print("Tableau 1 :");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print("   "+tableau1[i]);
        }
        System.out.print("\nTableau 2 :");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print("   "+tableau2[i]);
        }
        System.out.print("\nRésultat  :");
        for (int i = 0; i < resultat.length; i++) {
            resultat[i]=tableau1[i]+tableau2[i];
            if (resultat[i]<10) {
                System.out.print("   "+resultat[i]);
            } else {
                System.out.print("  "+resultat[i]);
            }
        }
    }
}