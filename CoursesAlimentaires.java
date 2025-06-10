import java.util.Scanner;

public class CoursesAlimentaires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        String recap = "";
        String dernierArticle = "";
        double dernierPrix = 0.0;
        int nombreArticles = 0;
        boolean premierArticle = true;
        boolean continuer = true;

        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        while (true) {
            // Saisie du nouvel article
            System.out.print("- ");
            String article = sc.nextLine();
            
            // Saisie du prix
            System.out.println("Combien ça coûte ? :");
            double prix = sc.nextDouble();
            
            // Mise à jour des informations
            dernierArticle = article;
            dernierPrix = prix;
            recap += "- " + article + " , " + String.format("%.2f", prix) + " euros\n";
            total += prix;
            nombreArticles++;
            System.out.println("\nVoulez-vous acheter autre chose ?");
            continuer = sc.nextBoolean();
            if (continuer){
                // Menu de choix après chaque ajout
                System.out.println("\nOptions :");
                System.out.println("1. Ajouter un autre article");
                System.out.println("2. Retirer le dernier article (" + dernierArticle + ")");
                System.out.println("3. Terminer les courses");
                System.out.print("Votre choix (1-3) : ");
                sc.nextLine(); // Nettoyage du buffer
            }else{
                break;
            }

            int choix = sc.nextInt();
            sc.nextLine(); // Nettoyage du buffer
            
            if (choix == 2 && nombreArticles > 0) {
                // Retrait du dernier article
                total -= dernierPrix;
                nombreArticles--;
                
                // Reconstruction du récapitulatif sans le dernier article
                recap = "";
                System.out.println("\n>> " + dernierArticle + " a été retiré! <<");
                
                // Réinitialisation pour la prochaine saisie
                dernierArticle = "";
                dernierPrix = 0.0;
                
                // Si tous les articles ont été retirés
                if (nombreArticles == 0) {
                    System.out.println("Que voulez-vous acheter ? :");
                    premierArticle = true;
                }
            }
            
            if (choix == 3) break;
            if (choix != 2) System.out.println("\nQue voulez-vous acheter ? :");
        }
        
        // Affichage final
        System.out.println("\nRécapitulatif de vos courses :\n");
        System.out.print(recap);
        System.out.println("\nTotal de vos courses : " + String.format("%.2f", total).replace('.', ',') + "€");
    }
}