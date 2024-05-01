package task2;

public class UserManager {

    private DatabaseManager dbManager;



    public UserManager() {

        this.dbManager = new DatabaseManager();

    }



    public void createUser(User user) {

        // Додавання користувача в базу даних

        dbManager.save(user);

        // Відправлення електронного листа

        EmailService.sendWelcomeEmail(user.getEmail());

    }

}
