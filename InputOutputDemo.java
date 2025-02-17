import java.util.Scanner;
public class InputOutputDemo {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int userInt = input.nextInt();
System.out.print("Enter a decimal number: ");
double userDouble = input.nextDouble();
input.nextLine(); // Consume newline
System.out.print("Enter a word or sentence: This is a String ");
String userString = input.nextLine();
System.out.printf("Your integer: %d%n", userInt);
System.out.printf("Your decimal number: %.2f%n", userDouble);
System.out.printf("Your string: This is a String %s%n", userString);
input.close();
    }
}
		
	