/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizi*/


import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        String dayOfWeekString = dayOfWeek.toString();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = dateTime.format(formatter);

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeekString);
        System.out.println("Data formattata: " + formattedDate);
    }
}

