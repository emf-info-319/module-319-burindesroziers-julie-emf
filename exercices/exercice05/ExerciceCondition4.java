public class ExerciceCondition4 {
    public static void main(String[] args) {
        int min=-20;
        int max=40;
        int temperature=(int)(Math.random()*(max-min+1))+min;
        System.out.println("La température est "+temperature+".");
        if (temperature<-10) {
            System.out.println("Il fait très froid.");
        }else if (temperature<0) {
            System.out.println("Il fait froid.");
        }else if (temperature<25) {
                System.out.println("Il fait normal.");
        }else if (temperature<36) {
            System.out.println("Il fait chaud.");
        }else{
            System.out.println("Il fait très chaud.");
        }
    }
}
