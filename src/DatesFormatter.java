import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat MonthFormat = new SimpleDateFormat("MMMM");
        String Month = MonthFormat.format(currentDate);

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d");
        String dayOfMonth = dayOfMonthFormat.format(currentDate);

        System.out.println("Current month: " + Month);
        System.out.println("Current day of the week: " + dayOfWeek);
        System.out.println("Current day in month: " + dayOfMonth);
        
    }
}
