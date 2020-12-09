package assessment1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public String convertDate(String day, String month, String year) throws ParseException {
        DateFormat originalFormat = new SimpleDateFormat("dd MMMM yyyy");
        DateFormat targetFormat = new SimpleDateFormat("d/M/yy");

        Date date = originalFormat.parse(day + " " + month + " " + year);
        String formattedDate = targetFormat.format(date);

        return formattedDate;
    }
}
