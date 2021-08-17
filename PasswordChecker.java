import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter password guess:");
        String PasswordGuess = keyboard.nextLine();
        String SamplePassword = "banana";
        boolean correct_status = PasswordGuess.equals(SamplePassword);
        System.out.println(correct_status);
        if (!correct_status) {
            int GuessLength = PasswordGuess.length();
            int SampleLength = SamplePassword.length();
            String PasswordGuessLower = PasswordGuess.toLowerCase();
            String SamplePasswordLower = SamplePassword.toLowerCase();
            if (GuessLength != SampleLength) {
                System.out.println("incorrect length");
            }
            else if (PasswordGuessLower.equals(SamplePasswordLower)) {
                    System.out.println("Upper/Lower case mismatch");
            }
            else {
                    System.out.println("incorrect characters");
            }
        }
    }
}


