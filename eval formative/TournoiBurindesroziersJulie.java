public class TournoiBurindesroziersJulie {
    public static final String[] EQUIPES = new String[] { "FC Richemont", "FC Central", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public static final int MAX_GOAL = 10;
    public static int[] pointsEquipes;

    public static void main(String[] args) {
        pointsEquipes = new int[EQUIPES.length];
        for (int i = 0; i < EQUIPES.length; i++) {
            if (i==EQUIPES.length) {
                simuleMatch(i, 0);
            }else{
                simuleMatch(i, i+1);
            }
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println(EQUIPES[i]+" a "+pointsEquipes[i]+" points");
        }
        System.out.println("-----------------------------");
        int[] gagnants = new int[trouveGagnant().length];
        for (int i = 0; i < gagnants.length; i++) {
            int indexGagnant = gagnants[i];
            System.out.println(EQUIPES[indexGagnant]+" a gagné");
        }
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index1] += 3;
            System.out.println(EQUIPES[index1] + " a gagné contre " + EQUIPES[index2]);
        } else if (scoreEquipe1 < scoreEquipe2) {
            pointsEquipes[index2] += 3;
            System.out.println(EQUIPES[index2] + " a gagné contre " + EQUIPES[index1]);
        } else {
            pointsEquipes[index1]++;
            pointsEquipes[index2]++;
            System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
        }
    }

    public static int rechercheMaxPts() {
        int nombre = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (nombre<pointsEquipes[i]) {
                nombre=pointsEquipes[i];
            }
        }
        return nombre;
    }

    public static int[] trouveGagnant(){
        int maxPts=rechercheMaxPts();
        int compteurDesGagnants = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i]==maxPts) {
                compteurDesGagnants++;
            }
        }
        int[] equipeGagnante = new int[compteurDesGagnants];
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i]==maxPts) {
                for (int j = 0; j < equipeGagnante.length; j++) {
                    if (equipeGagnante[j]==0) {
                        equipeGagnante[j]=i;
                    }
                }
            }
        }
        return equipeGagnante;
    }

}
