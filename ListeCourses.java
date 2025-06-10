import java.util.ArrayList;
import java.util.Scanner;

public class ListeCourses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> articles = new ArrayList<>();
        ArrayList<Double> prix = new ArrayList<>();
        boolean continuer = true;
        int action;
        
        System.out.println("*** APPLICATION DE LISTE DE COURSES ***");
        
        while(continuer) {
            // Menu principal
            System.out.println("\nQue souhaitez-vous faire ?");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Retirer un article");
            System.out.println("3. Afficher la liste actuelle");
            System.out.println("4. Terminer et afficher le récapitulatif");
            System.out.print("Votre choix : ");
            action = sc.nextInt();
            sc.nextLine();  // Nettoyage du buffer
            
            switch(action) {
                case 1: // Ajout d'article
                    System.out.print("\nNom de l'article à ajouter : ");
                    String article = sc.nextLine();
                    System.out.print("Prix de l'article : ");
                    double prixArticle = sc.nextDouble();
                    sc.nextLine();  // Nettoyage du buffer
                    
                    articles.add(article);
                    prix.add(prixArticle);
                    System.out.println("\n>>> " + article + " ajouté avec succès!");
                    break;
                    
                case 2: // Retrait d'article
                    if(articles.isEmpty()) {
                        System.out.println("\nLa liste est vide!");
                        break;
                    }
                    
                    System.out.println("\nArticles disponibles :");
                    for(int i = 0; i < articles.size(); i++) {
                        System.out.println((i+1) + ". " + articles.get(i) + " - " + prix.get(i) + "€");
                    }
                    
                    System.out.print("\nNuméro de l'article à retirer : ");
                    int choix = sc.nextInt();
                    sc.nextLine();  // Nettoyage du buffer
                    
                    if(choix > 0 && choix <= articles.size()) {
                        String articleSupprime = articles.remove(choix - 1);
                        double prixSupprime = prix.remove(choix - 1);
                        System.out.println("\n>>> " + articleSupprime + " retiré avec succès!");
                    } else {
                        System.out.println("\nNuméro invalide!");
                    }
                    break;
                    
                case 3: // Affichage de la liste actuelle
                    if(articles.isEmpty()) {
                        System.out.println("\nVotre liste est vide!");
                    } else {
                        System.out.println("\n--- LISTE ACTUELLE ---");
                        double totalPartiel = 0.0;
                        for(int i = 0; i < articles.size(); i++) {
                            System.out.printf("%d. %s - %.2f€%n", (i+1), articles.get(i), prix.get(i));
                            totalPartiel += prix.get(i);
                        }
                        System.out.printf("TOTAL PARTIEL : %.2f€%n", totalPartiel);
                    }
                    break;
                    
                case 4: // Terminer le programme
                    continuer = false;
                    break;
                    
                default:
                    System.out.println("\nChoix invalide!");
            }
        }
        
        // Affichage du récapitulatif final
        System.out.println("\n\n=== RÉCAPITULATIF DE VOS COURSES ===");
        double total = 0.0;
        
        if(articles.isEmpty()) {
            System.out.println("Aucun article dans votre liste!");
        } else {
            for(int i = 0; i < articles.size(); i++) {
                System.out.printf("- %s, %.2f€%n", articles.get(i), prix.get(i));
                total += prix.get(i);
            }
        }
        
        System.out.printf("\nTOTAL À PAYER : %.2f€%n", total);
        System.out.println("Merci pour vos achats !");
        sc.close();
    }
}