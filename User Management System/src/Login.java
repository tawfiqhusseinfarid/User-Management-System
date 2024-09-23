import java.util.Scanner;

public class Login {
    public void login() {
        System.out.print("Enter username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User[] users = new User[0];
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return;
            }
        }
        System.out.println("Login failed. Username or password incorrect.");
    }
}
