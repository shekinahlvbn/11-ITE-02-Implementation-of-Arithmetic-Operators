import java.util.Scanner;

class SubtractionCustodio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first value: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second value: ");
        int num2 = scan.nextInt();

        int sub = num1 - num2;

        System.out.println("The difference is " + sub);
    }
}
