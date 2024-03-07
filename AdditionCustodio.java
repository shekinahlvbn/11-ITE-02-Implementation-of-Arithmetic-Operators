import java.util.Scanner;

class AdditionCustodio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first value: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second value: ");
        int num2 = scan.nextInt();

        int add = num1 + num2;

        System.out.println("The sum is " + add);
    }
}
