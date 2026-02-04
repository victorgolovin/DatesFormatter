import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();


        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        System.out.println("Current day of the week: " + dayOfWeek);
    }
}
