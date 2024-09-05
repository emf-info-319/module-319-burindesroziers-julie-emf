public class ExerciceCondition3 {
    public static void main(String[] args) {
        int min=-20;
        int max=20;
        int valeur1=(int)(Math.random()*(max-min+1))+min;
        int valeur2=(int)(Math.random()*(max-min+1))+min;
        System.out.println("Les nombres à multiplier sont "+valeur1+" et "+valeur2+".");
        if (valeur1>=0 && valeur2>=0 || valeur1<0 && valeur2<0) {
            System.out.println("Le résultat est positif.");
        } else {
            System.out.println("Le résultat est négatif.");
        }
    }
}
