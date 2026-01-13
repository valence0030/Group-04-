import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class date_time {
    public static void main(String[] args) {

            //To Get current date, time, and date-time
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            LocalDateTime currentDateTime = LocalDateTime.now();

            //Firstly, display current date
            System.out.println("Current Date: " + currentDate);

            // Secondly, display current time
            System.out.println("Current Time: " + currentTime);

            // Lastly, display current year
            System.out.println("Current Year: " + currentDate.getYear());
        }

}
