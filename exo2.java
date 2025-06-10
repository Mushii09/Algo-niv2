
import java.util.Scanner;

public class exo2{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      boolean continuer=true;
        double total = 0.0;

      System.out.println("\n==MAGASIN==\n");
      System.out.println("Articles disponibles :");
      System.out.println("1. Farine (1.45€)");
      System.out.println("2. Oeuf (1.52€)");
      System.out.println("3. Lait (1.85€)");
      System.out.println("0. Terminer les achats");


      while(continuer){
         System.out.println("\n Que voulez vous acheter : ");
         int choix = sc.nextInt();
         switch(choix) {
                case 1:
                    System.out.println("Farine ajoutée - 1.45€");
                    total += 1.45;
                    break;
                case 2:
                    System.out.println("Oeuf ajouté - 1.52€");
                    total += 1.52;
                    break;
                case 3:
                    System.out.println("Lait ajouté - 1.85€");
                    total += 1.85;
                    break;
                case 0:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide!");
         }
      }
   }
}

/*PSEUDO CODE
 * 
 * Veux acheter un truc ?
 * true
 *
 * 
 * 
 * 
 */
/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * Combien, ça côute ?:
 * 1.45
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * Que voulez vous acheter ?
 * Lait
 * Combien, ça côute ?:
 * 1.30
    * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */


