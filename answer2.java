import java.util.Scanner;

public class answer2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nombre;

        do {
            System.out.println("\nCombien y a t'il de jours dans la semaine ?");
            nombre= clavier.nextInt();
            if (nombre!=7){
                System.out.println("\nMauvaise réponse !  Retente ta chance !");
            }
        }
            while(nombre!=7);
                System.out.println("\nBonne réponse !");
        clavier.close();
    }
}
