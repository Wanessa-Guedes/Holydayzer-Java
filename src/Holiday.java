import java.util.ArrayList;
import java.util.List;

public class Holiday {
    private List<String> date = new ArrayList<>();
    private List<String> name = new ArrayList<>();

    public Holiday() {
        Holidays();
    }

    public void Holidays() {
        date.add("01/01/2023");
        name.add("Confraternização mundial");
        date.add("21/02/2023");
        name.add("Carnaval");
        date.add("17/04/2023");
        name.add("Páscoa");
        date.add("21/04/2023");
        name.add("Tiradentes");
        date.add("01/05/2023");
        name.add("Dia do trabalho");
        date.add("08/06/2023");
        name.add("Corpus Christi");
        date.add("07/09/2023");
        name.add("Independência do Brasil");
        date.add("12/10/2023");
        name.add("Nossa Senhora Aparecida");
        date.add("02/11/2023");
        name.add("Finados");
        date.add("15/11/2023");
        name.add("Proclamação da República");
        date.add("25/12/2023");
        name.add("Natal");
    }

    public String getHolliday(String date) {
        for (int i = 0; i < this.date.size(); i++) {
            if (this.date.get(i) == date) {
                return "Dia " + date + " é feriado!! Prepare-se para comemorar o(a) " + this.name.get(i);
            }
        }
        return "No dia " + date + " não tem feriado =(";
    }

    public void allHolidays() {
        for (int i = 0; i < this.date.size(); i++) {
            System.out.println(this.date.get(i) + " => " + this.name.get(i));
        }
    }
}
