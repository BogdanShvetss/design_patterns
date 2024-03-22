package chain;

public class Main {
    public static void main(String[] args) {
        EmailFilter emailFilter = new EmailFilter();

        Email spamEmail =
                new Email("booking@gmail.com", "mycompany@gmail.com", "discounts", "ads");
        emailFilter.filtering(spamEmail);

        Email installationRequestEmail =
                new Email("company@gmail.com", "mycompany@gmail.com", "installation", "new machine");
        emailFilter.filtering(installationRequestEmail);
    }
}
