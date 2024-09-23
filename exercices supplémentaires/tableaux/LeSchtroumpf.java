public class LeSchtroumpf {
    public static void main(String[] args) {
        int[] tableau1 = new int[]{4,8,7,12};
        int[] tableau2 = new int[]{3,6};
        int schtroumpf=0;

        System.out.print("Tableau 1 :");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print("  "+tableau1[i]);
        }

        System.out.print("\nTableau 2 :");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print("  "+tableau2[i]);
        }

        for (int i = 0; i < tableau1.length; i++) {
            for (int j = 0; j < tableau2.length; j++) {
                schtroumpf+=tableau1[i]*tableau2[j];
            }
        }
        System.out.print("\nLe Schtroumpf sera :");
        for (int i = 0; i < tableau2.length; i++) {
            for (int j = 0; j < tableau1.length; j++) {
                if (i==tableau2.length-1 && j==tableau1.length-1) {
                    System.out.print(" "+tableau2[i]+"*"+tableau1[j]+" = ");
                } else {
                    System.out.print(" "+tableau2[i]+"*"+tableau1[j]+" + ");
                }
            }
        }
        System.out.println(schtroumpf);
    }
}
