import java.util.Scanner;

public class ForgetPassword {
    public void forgetPassword() {
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        User[] users = new User[0];
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
}
