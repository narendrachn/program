import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class convertTimeFrom12to24hours {

    public static void main(String[] args) {
        String time12 = "02:30 PM";
        DateFormat inFormat = new SimpleDateFormat("hh:mm aa");
        DateFormat outFormat = new SimpleDateFormat("HH:mm");

        try {
            Date date = inFormat.parse(time12);
            String time24 = outFormat.format(date);
            System.out.println("24-hour format: " + time24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
