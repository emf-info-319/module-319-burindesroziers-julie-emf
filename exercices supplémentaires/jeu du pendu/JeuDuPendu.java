
public class JeuDuPendu {
    public static void main(String[] args) {
        String[] tableauDeMotsATrouver = new String[] { "LAPIN", "GRENOUILLE", "RENARD" };
        int index = (int) (Math.random() * (tableauDeMotsATrouver.length + 1));

        char[] lettresATrouver = tableauDeMotsATrouver[index].toCharArray();
        char[] lettresRecherche = new char[lettresATrouver.length];
        for (int i = 0; i < lettresRecherche.length; i++) {
            lettresRecherche[i] = '_';
        }

        Scanner entree = new Scanner(System.in);
        System.out.print("Entrez une lettre svp : ");
        char lettre = entree.nextchar;
    }
}
