public class App {
    public static void main(String[] args) throws Exception {
        Holiday holiD = new Holiday();

        System.out.println();
        System.out.println(holiD.getHolliday("21/02/2023"));
        System.out.println();
        System.out.println(holiD.getHolliday("01/05/2023"));
        System.out.println();
        System.out.println(holiD.getHolliday("13/01/2023"));

        System.out.println();
        System.out.println("Lista de todos os feriados: ");
        holiD.allHolidays();
    }
}
