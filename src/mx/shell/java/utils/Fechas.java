package mx.shell.java.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fechas {
    public static int calcularEdad(String fechaNac) {
        int dia,mes,anio;
        String fecha[] = fechaNac.split("/");

        dia = Integer.parseInt(fecha[0]);
        mes = Integer.parseInt(fecha[1]) - 1;
        anio = Integer.parseInt(fecha[2]);

        Calendar cal = new GregorianCalendar(anio, mes, dia);
        Calendar now = new GregorianCalendar();

        int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
                || ((cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_MONTH) > now
                .get(Calendar.DAY_OF_MONTH)))) {
            res--;
        }
        return res;
    }
}
