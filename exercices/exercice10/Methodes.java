/**
 * Methodes
 */
public class Methodes {

    public static void main(String[] args) {
        direBonjour();
        dire("mot");
        System.out.println(Math.min(10, 5));//choisi le plus petit
        System.out.println(Math.max(10, 5));//choisi le plus grand
        System.out.println(Math.pow(10, 2));//élève le premier chiffre à la puissance du deuxième
        System.out.println(Math.sqrt(4));//racine carrée
        System.out.println(Math.abs(-3));//valeur absolue
    }
    public static void direBonjour(){
        System.out.println("Bonjour");
    }
    public static void dire(String mot){
        System.out.println(mot);
    }
}