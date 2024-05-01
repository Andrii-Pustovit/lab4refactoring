package task2;

public class UserManager {

    private DatabaseManager dbManager;

    public UserManager() {
        this.dbManager = new DatabaseManager();
    }

    public void createUser(User user) {
        dbManager.save(user);
        EmailSender.sendWelcomeEmail(user.getEmail());
    }

}

