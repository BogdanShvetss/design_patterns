package builder;

public class Tent extends Accommodation {
    int siteNumber;

    public Tent() {
        name = "Tent";
    }

    public Tent(String name) {
        this.name = name;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public String getLocation() {
        if (siteNumber == 0) return "";
        else return "Site number " + siteNumber;
    }
}