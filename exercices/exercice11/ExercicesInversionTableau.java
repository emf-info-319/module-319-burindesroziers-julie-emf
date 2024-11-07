/**
 * ExercicesInversionTableau
 */
public class ExercicesInversionTableau {

    public static int[] inverseLeTableau(int[]tableauAInverser){
        int[] tableauInverse = new int[tableauAInverser.length];
        for (int i = 0; i < tableauInverse.length; i++) {
            for (int j = tableauInverse.length-1-i; j >=0; j--) {
                tableauInverse[j]=tableauAInverser[i];
                break;
            }
        }
        return tableauInverse;
    }
    public static final int MIN =0;
    public static final int MAX =100;
    public static void main(String[] args) {
        System.out.println("Contenu de tableau initial :");
        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i]=(int)(Math.random()*(MAX-MIN+1))+MIN;
            System.out.println("Tableau initial ["+i+"] = "+tableauInitial[i]);
        }
        System.out.println("\nContenu du tableau final :");
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final ["+i+"] = "+tableauFinal[i]+" ");
        }
        
    }
}