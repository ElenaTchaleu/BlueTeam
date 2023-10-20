import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number greater than 1 ");
        int MaxValue = scanner.nextInt();

        for (int i = 1; i <= MaxValue; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
