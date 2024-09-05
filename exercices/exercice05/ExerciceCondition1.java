public class ExerciceCondition1 {
    public static void main(String[] args) {
        int min=-20;
        int max=20;
        int valeurATester=(int)(Math.random()*(max-min+1))+min;
        System.out.println("Le nombre est "+valeurATester+".");
        if (valeurATester>=0) {
            System.out.println("La valeur est positive.");
        } else {
            System.out.println("La valeur est négative.");   
        }

    }
    
}