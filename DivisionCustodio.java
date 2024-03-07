import java.util.Scanner;

class DivisionCustodio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first value: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second value: ");
        int num2 = scan.nextInt();

        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("The quotient is " + div);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero second value.");
        }
    }
}
