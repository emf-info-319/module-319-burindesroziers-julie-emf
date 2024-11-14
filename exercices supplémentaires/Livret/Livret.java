public class Livret {

    public static final int MIN = 2;
    public static final int MAX = 5;

    public static int choisirUnNombre(int min, int max) {
        int nombre = (int) (Math.random() * (max - min + 1)) + min;
        return nombre;
    }

    public static String[] construireTableMultiplication(int longueur, int nombreJusquA) {
        String[] tableauDeString = new String[nombreJusquA * longueur];
        int i = 0;
        for (int j = 1; j <= longueur; j++) {
            for (int k = 1; k <= nombreJusquA; k++) {
                tableauDeString[i] = (j) + " x " + (k) + " = " + (k * j);
                i++;
            }
        }
        return tableauDeString;
    }

    public static void main(String[] args) {
        int nombre1 = choisirUnNombre(MIN, MAX);
        int nombre2 = choisirUnNombre(MIN, MAX);
        String[] livrets = construireTableMultiplication(nombre1, nombre2);
        System.out.println("Les chiffres sont: " + nombre1 + " " + nombre2);
        for (int i = 0; i < livrets.length; i++) {
            System.out.println(livrets[i]);
        }
    }
}