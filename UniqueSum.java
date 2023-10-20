import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UniqueSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int sum = 0;
        System.out.println("Input first value: ");
        a = scanner.nextInt();
        System.out.println("Input second value: ");
        b = scanner.nextInt();
        System.out.println("Input third value: ");
        c = scanner.nextInt();

        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }

        System.out.println("The sum of the unique integers is: " + sum);
    }
}