public class TableDeMultiplication {
    public static void main(String[] args) {
        int nombre=7;
        System.out.println("Table de "+nombre+" :");
        for (int i = 0; i <= 10; i++) {
            int resultat=nombre*i;
            System.out.println(nombre+" x "+i+" = "+resultat);
        }
    }
}
