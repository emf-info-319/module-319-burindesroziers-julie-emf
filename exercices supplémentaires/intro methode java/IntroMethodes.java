
/**
 * IntroMethodeJava
 */
import java.util.Scanner;
public class IntroMethodes {
    public static void main(String[] args) {
        begining();
        int number1 = demandeNombre();
        int number2 = demandeNombre();
        int number3 = demandeNombre();
        sumOfNumbers(number1, number2, number3);
        ending();
    }
    public static void begining() {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours.\n");
    }
    public static void ending() {
        System.out.println("\nProgramme terminé");
    }
    public static int demandeNombre() {
        System.out.print("Entrez un nombre : > ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + number + " !");
        return number;
    }
    public static int sumOfNumbers(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println("\nLa somme est : " + result);
        return result;
    }
}