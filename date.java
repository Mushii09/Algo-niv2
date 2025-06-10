import java.time.LocalDateTime;    // Importe la classe pour représenter date + heure
import java.time.format.DateTimeFormatter;  // Importe la classe pour formater les dates

public class date {
    public static void main(String[] args) {

        // 1. OBTENTION DE LA DATE ACTUELLE
        // Crée un objet LocalDateTime contenant la date/heure actuelle du système
        LocalDateTime now = LocalDateTime.now();

        // 2. FORMATAGE DE LA DATE
        // Définit un modèle de formatage : 
        // - yyyy : année sur 4 chiffres
        // - MM   : mois sur 2 chiffres (01-12)
        // - dd   : jour sur 2 chiffres (01-31)
        // - HH   : heure au format 24h (00-23)
        // - mm   : minutes (00-59)
        // - ss   : secondes (00-59)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Sortie possible : "05/06/2025 à 15h30"

        // Applique le formatage à la date actuelle
        String formattedDate = now.format(formatter);
        System.out.println("\nDate formatée : " + formattedDate);

        // 3. CONVERSION TEXTE VERS DATE (Parsing)
        // Chaîne représentant une date/heure valide (doit respecter le modèle)
        String dateTimeString = now.format(formatter);
        System.out.println("\nDate parsé : " + formattedDate);
        
        // Conversion de la chaîne en objet LocalDateTime
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Date parsée : " + parsedDate+"\n");
    }
}