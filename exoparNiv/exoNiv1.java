package exoparNiv;
import java.util.Scanner;

public class exoNiv1 {
    public static void main(String[] args) {
        boolean reponse=true;
        String question = "";
        String commande = "";
        Scanner clavier = new Scanner(System.in);

        for(int i = 1; i <= 4; i++) {
            // Sauter la question 2 si la réponse précédente était végétarien (false)
            if(i == 2 && !reponse) {
                continue;
            }

            switch(i) {
                case 1: question = "Bonjour, votre commande est avec viande (true) ou vegetarien (false)?"; 
                if (reponse ==true){
                    commande+= "- Menu Carnivore";
                }else {
                    commande+= "- Menu vegetarien";
                }break;

                case 2: question = "Votre steak vous le voulez saignant (true) ou à point (false) ?"; 
                 if (reponse==true){
                    commande+= "- Steak saignant";
                }else {
                    commande+= "- Steak à point";
                }break;
                case 3: question = "Frites (true) ou riz (false) ?";  
                if (reponse ==true){
                    commande+= "- Frites";
                }else {
                    commande+= "- Riz";
                }break;
                case 4: question = "Soda (true) ou eau gazeuse (false)"; if (reponse =true){
                    commande+= "- Soda";
                }else {
                    commande+= "- Eau gazeuse";
                } break;
            }

                commande+="\n";
                System.out.println("\nQuestion "+i+" : "+question);
                reponse = clavier.nextBoolean();
        }

        System.out.println("\nMerci pour votre commande :\n"+commande+" , ça sera prêt dans 20min !");
        clavier.close();
    }
}



/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
    Créer un système de commande de restauration

 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)

 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 - Frites (true) ou riz (false)
 true
 - Soda (true) ou eau gazeuse (false)
 false
    Merci poru votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */

