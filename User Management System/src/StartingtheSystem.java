import java.util.Scanner;

import static sun.java2d.loops.CustomComponent.register;

public class StartingtheSystem {
    public void start() {
        while (true) {
            System.out.println("\nUser Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Forget Password");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    new Login();
                    break;
                case 3:
                    new ForgetPassword();
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
