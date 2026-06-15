import java.util.Scanner;

public class CALCULATOR {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double num1, num2, result;
        char operator;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator: ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Answer: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Answer: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Answer: " + result);
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Answer: " + result);
                }
                else {
                    System.out.println("Cannot divide by 0. Try again.");
                }
                break;
            default:
                System.out.println("The operator " + operator + " is not valid.");
        }
    }
}