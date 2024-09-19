public class ExercieTableaux4 {
    public static void main(String[] args) {
        int nombreDeDépart=17;
        int[] tableauDeNombresConsécutifs= new int[5];
        for (int i = 0; i < tableauDeNombresConsécutifs.length; i++) {
            tableauDeNombresConsécutifs[i]=nombreDeDépart+i+1;
            System.out.println("Cellule "+i+" : "+tableauDeNombresConsécutifs[i]);
        }
    }
}
