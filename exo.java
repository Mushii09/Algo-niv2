import java.util.Scanner;

public class exo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
   
        for (int i = 1; i <= 4; i++) {
            // Sauter la question 2 si végétarien (false)
            if (i == 2 && !reponse) {
                continue;
            }

            switch (i) {
                case 1:
                    question = "Ajouter un produit?";
                    break;
                case 2:
                    question = "Retirer un produit ?";
                    break;
                case 3:
                    question = "Vérifier la liste ?";
                    break;
                case 4:
                    question = "Quitter";
                    break;
            }


            //  Ajout à la commande après avoir obtenu la réponse
            switch (i) {
                case 1:
                    commande += reponse ? "- Menu Viande" : "- Menu Végétarien";
                    break;
                case 2:
                    commande += reponse ? "- Steak saignant" : "- Steak à point";
                    break;
                case 3:
                    commande += reponse ? "- Frites" : "- Riz";
                    break;
                case 4:
                    commande += reponse ? "- Soda" : "- Eau Gazeuse";
                    break;
            }
        }

        System.out.println("\nMerci pour vos achats :\n" + listArticles);
        sc.close();
    }
}