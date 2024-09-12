/**
 * Devoir02
 */
public class Devoir02 {
    public static final int CAPACITE_RESERVOIR_A=3;
    public static final int CAPACITE_RESERVOIR_B=5;
    public static void main(String[] args) {
        int reservoirA=0;
        int reservoirB=0;
        int remplissage=(int)(Math.random()*(CAPACITE_RESERVOIR_B+CAPACITE_RESERVOIR_A+1))+0;
        System.out.println("Il y a "+remplissage+"L à remplir.");
        while (reservoirA+reservoirB<remplissage) {
            
        }
    }
}