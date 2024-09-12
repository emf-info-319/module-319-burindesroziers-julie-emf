public class Exercice08Exercice2 {
    public static void main(String[] args) {
        System.out.println("Boucle for:");
        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Décollage !!");
            } else {
                System.out.println(i);
            }//C'est dégueu mais je vais pas me casser les cacahuètes pour ça.
        }
        System.out.println("\nBoucle while:");
        int nombre = 5;
        while (nombre > 0) {
            System.out.println(nombre);
            nombre--;
            if (nombre < 1) {
                System.out.println("Décollage !!");
            }//idem
        }
        System.out.println("\nBoucle do-while:");
        int nombre2 = 5;
        do {
            System.out.println(nombre2);
            nombre2--;
        } while (nombre2 > 0);
        System.out.println("Décollage !!");
    }
}
