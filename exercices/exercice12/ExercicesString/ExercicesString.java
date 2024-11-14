/**
 * ExercicesString
 */
public class ExercicesString {

    public static void main(String[] args) {
        String maChaineDeCaractere="Voici du contenu stocké dans un String.";
        System.out.println("Nombre de caractères contenu dasn la variable maChineDeCaractère : "+maChaineDeCaractere.length());//longueur du string
        System.out.println("Le mot \"contenu\" commence à la position : "+maChaineDeCaractere.indexOf("contenu")); //quelle position de la chaîne de caractères commence le texte "contenu"
        System.out.println("La position 17 contient la lettre "+maChaineDeCaractere.substring(17, 18));
        String monPrenom = "Julietest";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position "+i+" est : "+monPrenom.substring(i,i+1));
        }
        //Manière 1
        if (monPrenom.indexOf("test")>=0) {
            System.out.println("La chaîne de caractère \""+monPrenom+"\" contient le texte \"test\".");
        }else{
            System.out.println("La chaîne de caractère \""+monPrenom+"\" ne contient pas le texte \"test\".");
        }

        //Manière 2
        if (monPrenom.contains("test")) { //contient un mot
            System.out.println("La chaîne de caractère \""+monPrenom+"\" contient le texte \"test\".");
        }else{
            System.out.println("La chaîne de caractère \""+monPrenom+"\" ne contient pas le texte \"test\".");
        }
    }
}