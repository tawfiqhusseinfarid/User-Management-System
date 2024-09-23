import jdk.internal.icu.text.UnicodeSet;

import java.util.Scanner;

public class Register {
    public void register() {
        System.out.print("Enter username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter secret question: ");
        String secretQuestion = scanner.nextLine();
        System.out.print("Enter secret answer: ");
        String secretAnswer = scanner.nextLine();


        UnicodeSet users = null;
        users.add((CharSequence) new User(username, password, email, secretQuestion, secretAnswer));
        System.out.println("Registration successful.");
    }
}
