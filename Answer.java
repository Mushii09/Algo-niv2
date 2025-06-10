import java.util.Scanner;
public class Answer {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String response;
        
        do {
            System.out.println("\nDe quel couleur est le soleil ?");
            response = clavier.nextLine();
            if (!response.equalsIgnoreCase("jaune")){
                System.out.println("\nEssaye encore ! Mauvaise réponse");
            }
        } while (!response.equalsIgnoreCase("jaune"));
        System.out.println("Bonne réponse ! ");
        clavier.close();
    }
}

/*Me faire un espèce de questionnaire tant que la réponse du questionnaire est mauvaise, il répète la question et dit mauvaise. */