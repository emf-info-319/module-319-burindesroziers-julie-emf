/**
 * Phraseur
 */
public class Phraseur {

    public static int nbreAleatoire(int max, int min){
        int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return nombre;
    }
    public static String choisirMot(String[] tableauMots){
        int nombre = nbreAleatoire(tableauMots.length-1, 0);
        String mot = tableauMots[nombre];
        return mot;
    }

    public static void main(String[] args) {
        String[] sujets = new String[]{"Pierre", "Paul", "Jacques"};
        String[] verbes = new String[]{"mange", "boit", "regarde"};
        String[] choses = new String[]{"de l'eau", "une orange", "une noix de coco"};
        for (int i = 0; i < 10; i++) {
            System.out.println(choisirMot(sujets)+" "+choisirMot(verbes)+" "+choisirMot(choses));
        }
    }
}