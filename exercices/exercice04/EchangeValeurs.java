public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1=1;
        int variable2=2;
        System.out.println("Le contenu de la variable1 est "+variable1);
        System.out.println("Le contenu de la variable2 est "+variable2);
        System.out.println("... Traitement ...");
        int nbreEchange=0;
        nbreEchange=variable1;
        variable1=variable2;
        variable2=nbreEchange;
        System.out.println("Le contenu de la variable1 est "+variable1);
        System.out.println("Le contenu de la variable2 est "+variable2);


    
 }   
}
