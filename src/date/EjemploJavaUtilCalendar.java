package date;

import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2021, Calendar.AUGUST, 12, 14, 20, 35);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
    }
}
