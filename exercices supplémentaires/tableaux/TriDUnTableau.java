public class TriDUnTableau {
    public static void main(String[] args) {
        int[] tableau = new int[] { 4, 8, 7, 9, 1, 5, 4, 6 };
        System.out.print("Tableau avant :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(" " + tableau[i]);
        }
        int stock=0;
        System.out.print("\nTableau après :");
        for (int j=0; j<tableau.length;j++){
            for (int i = 0; i < tableau.length; i++) {
                if (i!=(tableau.length-1) && tableau[i]>=tableau[i+1]) {
                    stock=tableau[i+1];
                    tableau[i+1]=tableau[i];
                    tableau[i]=stock;
                }
            }
        }
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(" "+tableau[i]);
        }
    }   
}
