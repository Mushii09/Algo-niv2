
import java.util.Scanner;

public class exoNiv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String article;
        String course ="";
        boolean poursuivre = true;
        double price = 0.0;
        int compteur = 0;
        double total=0.0;

        System.out.println("Bonjour, que voulez acheter ?");
    
        do { 
           System.out.print("Article : ");
           article = sc.nextLine();

           System.out.println("\nCombien ça coûte (en EURO): ");
           price = sc.nextDouble();
        
           compteur++;
           total+=price;
           course=compteur+"- "+article+" "+price+" EUR";

            System.out.println("\nSouhaitez-vous acheter autre chose ?(true/false)");
            poursuivre = sc.nextBoolean();
            sc.nextLine();
            if (poursuivre){
                System.out.println("Que voulez-vous acheter ?");
            }
        } while (poursuivre);
        
        System.out.println(course);
        
        sc.close();
    }
}
 


/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing de vos courses alimentaires. Les afficher à la fin avec le coût total de vos courses
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
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

