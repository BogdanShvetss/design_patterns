package mediator;

public class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("Admin " + getName() + " get a message '" + message + "'");
    }
}