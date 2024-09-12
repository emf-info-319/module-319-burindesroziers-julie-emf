public class Exercice08Exercice1 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        int nombre = 1;
        while (nombre < 6) {
            System.out.println("Boucle while, itération " + nombre);
            nombre++;
        }
        int nombre2 = 1;
        do {
            System.out.println("Boucle do-while, itération " + nombre2);
            nombre2++;
        } while (nombre2 < 6);
        for (int i = 1; i < 6; i++) {
            if (i < 3 || i > 3) {
                System.out.println("Boucle for, itération " + i);
            }//ici il fallait utiliser un i==3 et un continue
        }
        int nombre3 = 1;
        while (nombre3 < 6) {
            if (nombre3<4) {
                System.out.println("Boucle while, itération " + nombre3);
            }
            nombre3++;
        }//ici il fallait utiliser un break
    }
}
