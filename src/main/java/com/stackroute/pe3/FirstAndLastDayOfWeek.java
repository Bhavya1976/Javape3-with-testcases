package main.java.com.stackroute.pe3;
/*This program prints the first and last of day of a week.
 * For that here I am taking the java pre-defined libraries like DateFormat,SimpleDateFormat and calendar.
 * And I am creating the instance for the calender class to access it. I aslo specify the simpleDateFormat and how it should be represented.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDayOfWeek
{

    public String firstAndLastDayOfWeek()
    {

        StringBuilder stringBuilder = new StringBuilder();

        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

        DateFormat dateformat = new SimpleDateFormat(" DD/MM/YYYY");

        stringBuilder = stringBuilder.append(dateformat.format(c.getTime()));
        for(int i = 0; i<6;i++)
        {
            c.add(Calendar.DATE, 1);
        }
        stringBuilder = stringBuilder.append("\n"+dateformat.format(c.getTime()));
        return stringBuilder.toString();

    }
}
