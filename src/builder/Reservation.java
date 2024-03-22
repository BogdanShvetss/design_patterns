package builder;

import java.time.LocalDate;

public class Reservation {
    LocalDate arrivalDate;
    int nights;

    public void setArrivalDate(int year, int month, int day) {
        this.arrivalDate = LocalDate.of(year, month, day);
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
