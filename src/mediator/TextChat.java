package mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Lack of rights");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("Chat doesn't have an admin");
        }

        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can't enter chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }

        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && user.isEnabled()) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }
        }

        if (admin.isEnabled()) {
            admin.getMessage(user.getName() + ": " + message);
        }
    }
}