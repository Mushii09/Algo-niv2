import java.util.Scanner;

public class exo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        int etape = 0;
        double total = 0.0;
        
        System.out.println("=== SUPERMARCHE EN LIGNE ===");
        System.out.println("Articles disponibles :");
        System.out.println("1. Farine (1.45€)");
        System.out.println("2. Oeuf (1.52€)");
        System.out.println("3. Lait (1.85€)");
        System.out.println("0. Terminer les achats");
        
        while(continuer) {
            System.out.print("\nVotre choix : ");
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
            
            if(continuer && choix != 0) {
                switch(etape) {
                    case 0:
                        System.out.println("\nSouhaitez-vous autre chose ? (true/false)");
                        break;
                    default:
                        System.out.println("\nAjouter autre chose ? (true/false)");
                }
                continuer = sc.nextBoolean();
                etape++;
            }
        }
        
        System.out.printf("\nTotal à payer : %.2f€\n", total);
        System.out.println("Merci pour vos achats !");
        sc.close();
    }
}
