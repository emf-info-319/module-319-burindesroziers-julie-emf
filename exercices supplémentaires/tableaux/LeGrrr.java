import java.util.Scanner;
public class LeGrrr {
    public static void main(String[] args) {
        Scanner scanneur = new Scanner(System.in);
        int grrr=0;
        int maximum = 0;
        System.out.println("Ce programme affiche la série des nombres qui ont le droit d'être prononcés dans le jeu du Grrr.");

        do {
            System.out.print("Entrer un chiffre entre 2 et 9 : ");
            grrr = scanneur.nextInt();
        } while (grrr<2 || grrr>9);

       do {
            System.out.print("Entrer une limite maximum : ");
            maximum = scanneur.nextInt();
       } while (maximum<0);

        for (int i = 1; i <= maximum; i++) {
            if (i%grrr==0) {
                continue;
            } else if ((i-grrr)%10==0) {
                continue;
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
