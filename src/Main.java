import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Your user name : ");
        username = inp.nextLine();

        System.out.print("Password : ");
        password = inp.nextLine();


        if (!password.equals("java123")) {
            System.out.println("Would you like to reset your password ?");
            String resetChoice = inp.nextLine();

            if (resetChoice.equals("yes")) {
                System.out.println("Enter the new password");
                String newPassword = inp.nextLine();

                if (!newPassword.equals("java123")) {
                    System.out.println("Password changed");

                } else {
                    System.out.println("The new password cannot be the same as the old password. Please enter a different password.");
                }
            }

        } else {
            System.out.println("Login succesfully");
        }
    }


}


