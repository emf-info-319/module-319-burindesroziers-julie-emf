package boucles;

/**
 * Additionneur
 */
public class Additionneur {

    public static void main(String[] args) {
        int nombre=5;
        int additionneur=0;
        for (int i=0; i<=nombre; i++){
            additionneur=additionneur+i;
        }
        System.out.println(additionneur);
    }
}