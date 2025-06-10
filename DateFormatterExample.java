import java.time.*;       
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DateFormatterExample {

    public static void main(String[]args) {

        boolean response = true;
        boolean isVegetarian = false;
        String commande = "";
        Scanner clavier = new Scanner(System.in);
        
        // Boucle de commande
        for(int i = 1; i <= 4; ) {

            String question = "";
            switch(i) {
                case 1:
                    question = "Bonjour, votre commande est avec viande ou vegetarien  ? (true/false)";
                    break;
                    
                case 2:
                    if(!isVegetarian) {
                        question = "Votre steak vous le voulez saignant ou à point ?  (true/false)";
                    }
                    break;
                    
                case 3:
                    question = "Frites ou riz ?  (true/false)";
                    break;
                    
                case 4:
                    question = "Soda (true) ou eau gazeuse (false):";
                    break;
            }

            // Gestion des questions sautées (cas végétarien)
            if(question.isEmpty()) {
                i++;
                continue;
            }

            // Lecture sécurisée avec try-catch
            boolean saisieValide = false;
            while(!saisieValide) {
                try {
                    System.out.println("\n" + i + ". " + question);
                    response = clavier.nextBoolean();
                    saisieValide = true;
                    
                    // Traitement des réponses
                    switch(i) {
                        case 1:
                            if(response) {
                                commande = "- Menu Viande\n";
                            } else {
                                commande = "- Menu Vegetarien\n";
                                isVegetarian = true;
                            }
                            break;
                            
                        case 2:
                            if(response) {
                                commande += "- Steak Saignant\n";
                            } else {
                                commande += "- Steak à point\n";
                            }
                            break;
                            
                        case 3:
                            if(response) {
                                commande += "- Frites\n";
                            } else {
                                commande += "- Riz\n";
                            }
                            break;
                    }
                } 
                catch (InputMismatchException e) {
                    System.out.println("Erreur : entrez 'true' ou 'false'");
                    clavier.next(); // Vide le buffer d'entrée
                }
            }
            i++; // Passage à la question suivante
        }

        // Traitement final pour la boisson
        if(response) {
            commande += "- Soda\n";
        } else {
            commande += "- Eau gazeuse\n";
        }

        // Heure actuelle formatée (avec secondes)
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = timeNow.format(formatter);
        
        // Calcul heure de préparation
        LocalTime readyTime;
        if(!isVegetarian) {
            readyTime = timeNow.plusMinutes(40);
        } else {
            readyTime = timeNow.plusMinutes(20);
        }
        String formattedReadyTime = readyTime.format(formatter);

        // Affichage final
        System.out.println("\nVotre commande a été passée à: " + formattedTime);
        System.out.println("Récapitulatif : \n" + commande);
        System.out.println("Elle sera prête à : " + formattedReadyTime);

        clavier.close();
    }
}