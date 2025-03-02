package Practicing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {

    public static String timeConversion(String s) {
        try {
            // Define o formato de entrada e de sada
            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ssa"); // Formato 12 horas (AM/PM)
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss");  // Formato 24 horas

            // Converte a string 12 horas para Date
            Date date = sdf12.parse(s);

            // Converte o Date para a string no formato 24 horas
            return sdf24.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
