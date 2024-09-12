public class devoir01 {
    public static void main(String[] args) {
        int monAge = 29;
        boolean estMajeur;
        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        System.out.println("Je m'appelle BdR Julie.");
        System.out.println("Mon âge est de : " + monAge + " ans");
        if (estMajeur == true) { //pléonasme
            System.out.println("Je suis majeur.");
        } else {
            System.out.println("Je ne suis pas encore majeur.");
        }
        int monAge2 = 30;
        boolean estMajeur2 = (monAge2 > 20);
        System.out.println("Je m'appelle BdR Donatien.");
        System.out.println("Mon âge est de : " + monAge2 + " ans");
        if (estMajeur2) {
            System.out.println("Je suis majeur.");
        } else {
            System.out.println("Je ne suis pas encore majeur.");
        }
        /*
         * on peut mettre la condition directement
         * dans estMajeur, parce que le résultat de la
         * "fonction" est soit true soit false
         */
    }
}