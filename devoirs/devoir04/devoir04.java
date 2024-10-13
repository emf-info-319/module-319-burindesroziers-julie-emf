public class Devoir04 {
    public static void main(String[] args) {
        int année = 2012;
        int mois = 4;
        int jour = 30;

        System.out.println("Date entrée est le "+jour+"."+mois+"."+année);

        boolean jourValable=true;
        if (année<0 || année>9999) {
            System.out.println("L'année ["+année+"] est hors limites !");
            jourValable=false;
        }
        if (mois<1 || mois>12){
            System.out.println("Le mois ["+mois+"] est hors limites !");
            jourValable=false;
        }
        boolean bisextile = false;
        if (année % 4 == 0) {
            bisextile = true;
            if (année % 400 == 0) {
                bisextile = true;
            }
        }
        
        int[] tableauMois = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (bisextile) {
            tableauMois[1] = 29;
        }
        if (jour<1||jour>tableauMois[mois-1]) {
            System.out.println("Le jour ["+jour+"] est hors limites !");
            jourValable=false;
        }
        /*if (jourValable) {
            switch (mois) {
                case 1:
                System.out.println("La date formatée est le "+jour+" janvier "+année);
                    break;
                case 2:
                System.out.println("La date formatée est le "+jour+" février "+année);
                    break;
                case 3:
                System.out.println("La date formatée est le "+jour+" mars "+année);
                    break;
                case 4:
                System.out.println("La date formatée est le "+jour+" avril "+année);
                    break;
                case 5:
                System.out.println("La date formatée est le "+jour+" mai "+année);
                    break;
                case 6:
                System.out.println("La date formatée est le "+jour+" juin "+année);
                    break;
                case 7:
                System.out.println("La date formatée est le "+jour+" juillet "+année);
                    break;
                case 8:
                System.out.println("La date formatée est le "+jour+" août "+année);
                    break;
                case 9:
                System.out.println("La date formatée est le "+jour+" novembre "+année);
                    break;
                case 10:
                System.out.println("La date formatée est le "+jour+" octobre "+année);
                    break;
                case 11:
                System.out.println("La date formatée est le "+jour+" novembre "+année);
                    break;
                case 12:
                System.out.println("La date formatée est le "+jour+" décembre "+année);
                    break;
                default:
                    break;
            }
        }*/
        String[] tableauNomsMois = new String[] { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre" };
        if (jourValable) {
            System.out.println("La date formatée est le "+jour+" "+tableauNomsMois[mois-1]+" "+année);
        }

    }
}
