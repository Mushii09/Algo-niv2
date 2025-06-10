import java.util.Scanner;

public class DistributeurBancaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double solde = 2000.0;
        int choix;
        boolean premiereFois = true;

        do {
            if (premiereFois) {
                System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");
                premiereFois = false;
            } else {
                System.out.println("\nvoulez-vous autres-choses ?");
            }

            System.out.println("(0)Quitter");
            System.out.println("(1)Retirer de l'argent");
            System.out.println("(2)Consulter votre solde");
            System.out.println("(3)Déposer de l'argent");
            System.out.print("\n");

            choix = scanner.nextInt();

            switch (choix) {
                case 0:
                    break;
                case 1:
                    System.out.print("\nCombien voulez-vous retirer ?:\n");
                    double retrait = scanner.nextDouble();
                    
                    if (retrait % 10 != 0) {
                        System.out.println("Désolé, vous ne pouvez retirer que des multiples de 10.");
                    } else if (solde - retrait < -500) {
                        System.out.println("Opération refusée : découvert maximum dépassé (500€) !");
                    } else {
                        solde -= retrait;
                        System.out.println("Opération acceptée : " + retrait + "€ ont été retiré,");
                    }
                    break;
                case 2:
                    System.out.println("\nVous avez actuellement " + solde + "€ sur votre solde");
                    break;
                case 3:
                    System.out.print("\nCombien voulez-vous déposer ?:\n");
                    double depot = scanner.nextDouble();
                    
                    if (depot < 5) {
                        System.out.println("Désolé, le montant minimum à déposer est de 5€.");
                    } else if (depot % 5 != 0) {
                        System.out.println("Désolé vous ne pouvez déposer que des billets");
                    } else {
                        solde += depot;
                    }
                    break;
                default:
                    System.out.println("Commande invalide !");
            }
        } while (choix != 0);

        System.out.println("\nMerci de votre visite, au revoir :) !");
        scanner.close();
    }
}