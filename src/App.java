import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        Holiday holiD = new Holiday();

        System.out.println();
        System.out.println(holiD.getHolliday("21/2/2023"));
        System.out.println();
        System.out.println(holiD.getHolliday("1/5/2023"));
        System.out.println();
        System.out.println(holiD.getHolliday("13/1/2023"));

        System.out.println();
        System.out.println("Hoje é " + day + "/" + month + "/" + year);
        System.out.println(holiD.getHolliday(day + "/" + month + "/" + year));

        System.out.println();
        System.out.println("Lista de todos os feriados: ");
        holiD.allHolidays();
    }
}
