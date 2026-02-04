import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat currentMonthFormat = new SimpleDateFormat("MMMM");
        String currentMonth = currentMonthFormat.format(currentDate);

        System.out.println("Current month: " + currentMonth);


        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        System.out.println("Current day of the week: " + dayOfWeek);


        SimpleDateFormat dayInMonthFormat = new SimpleDateFormat("dd");
        String dayInMonth = dayInMonthFormat.format(currentDate);

        System.out.println("Current day in month: " + dayInMonth);
    }
}
