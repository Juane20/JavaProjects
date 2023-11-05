package date;
import java.time.LocalDateTime; //Import LocalDate class
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        LocalDateTime myDateAndTime = LocalDateTime.now(); //Create the date object.
        System.out.println(myDateAndTime); //Without format
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateAndTime.format(myFormatter);
        System.out.println(formattedDate);
    }
}