/**
 * Symphonie
 */
public class Symphonie {

    public static final String[] NOTES = new String[]{"DO","RE","MI","FA","SOL","LA","SI"};
    public static final int NBRE_NOTES = 5;
    public static final int NBRE_PARITIONS = 3;
    public static int choisirUnNombre(int min, int max){
        int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return nombre;
    }
    public static boolean estDiese(){
        boolean diese = true;
        int nombre = choisirUnNombre(0, 1);
        if (nombre%2!=0) {
            diese=false;
        }
        return diese;
    }
    public static String creerLaPartition(int nombreDeNotes){
        String suiteDeNotes="";
        for (int i = 0; i < nombreDeNotes; i++) {
            int nombre = choisirUnNombre(0, NOTES.length-1);
            boolean diese = estDiese();
            if (diese) {
                suiteDeNotes += NOTES[nombre]+"# ";
            }else{
                suiteDeNotes += NOTES[nombre]+" ";
            }
        }
        return suiteDeNotes;
    }
    public static void main(String[] args) {
        for (int i = 0; i < NBRE_PARITIONS; i++) {
            System.out.println("La partition "+(i+1)+" est : "+creerLaPartition(NBRE_NOTES));
        }
    }
}