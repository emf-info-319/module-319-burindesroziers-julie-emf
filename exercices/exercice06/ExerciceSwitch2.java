public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int min=7;
        int max=12;
        int age=(int)(Math.random()*(max-min+1))+min;
        System.out.println("La personne a "+age+" ans.");
        if (age==7) {
            System.out.println("Poussin");
        } else if (age==8 || age==9) {
            System.out.println("Pupille");
        } else if (age==10 || age==11) {
            System.out.println("Minime");
        } else {
            System.out.println("Inconnu");
        }
        switch (age) {
            case 7:
            System.out.println("Poussin");
                break;
            case 8:
            case 9:
            System.out.println("Pupille");
                break;
            case 10:
            case 11:
            System.out.println("Minime");
                break;
            default:
            System.out.println("Inconnu");
                break;
        }
    }
}
