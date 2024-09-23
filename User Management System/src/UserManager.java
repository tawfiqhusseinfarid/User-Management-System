import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Register a new user
    public void register() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter secret question: ");
        String secretQuestion = scanner.nextLine();
        System.out.print("Enter secret answer: ");
        String secretAnswer = scanner.nextLine();

        users.add(new User(username, password, email, secretQuestion, secretAnswer));
        System.out.println("Registration successful.");
    }

    // User login
    public void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return;
            }
        }
        System.out.println("Login failed. Username or password incorrect.");
    }

    // Forget password operation
    public void forgetPassword() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Answer the secret question: " + user.getSecretQuestion());
                String answer = scanner.nextLine();
                if (user.getSecretAnswer().equals(answer)) {
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    user.setPassword(newPassword);
                    System.out.println("Password reset successful.");
                    return;
                } else {
                    System.out.println("Incorrect answer.");
                    return;
                }
            }
        }
        System.out.println("User not found.");
    }

    // Start the user management operations
    public void start() {
        while (true) {
            System.out.println("\nUser Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Forget Password");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    forgetPassword();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                    break;
            }
        }
    }
}
