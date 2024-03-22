package builder;

public class VacationDirector {
    public static void main(String[] args) {
        VacationBuilder outdoorsyVacationBuilder = new OutdoorsVacationBuilder();
        Vacation outdoorsyVacation = outdoorsyVacationBuilder
                .addAccommodation("Two person tent", 2024, 4, 22, 5, 101)
                .addEvent("Beach")
                .addEvent("Mountains")
                .getVacation();

        System.out.println(outdoorsyVacation);

        VacationBuilder cityVacationBuilder = new CityVacationBuilder();
        Vacation cityVacation = cityVacationBuilder
                .addAccommodation("Hilton", 2024, 8, 31, 2, 12)
                .addAccommodation("Plaza", 2024, 9, 2, 2, 14)
                .addEvent("Opera")
                .getVacation();

        System.out.println(cityVacation);
    }
}