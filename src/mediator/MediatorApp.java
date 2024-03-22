package mediator;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();
        User admin = new Admin(textChat, "admin");
        User user1 = new SimpleUser(textChat, "John");
        User user2 = new SimpleUser(textChat, "Ray");
        User user3 = new SimpleUser(textChat, "Randy");

        user2.setEnabled(true);
        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);
        textChat.addUser(user3);

        user1.sendMessage("Hello, I am a regular user");
        admin.sendMessage("Hey, I am admin");

        admin.setEnabled(false);
        admin.sendMessage("Test message");
    }
}