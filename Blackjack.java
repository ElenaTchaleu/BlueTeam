import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number greater than 0 ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter another number greater than 0 ");
        int num2 = scanner.nextInt();
        if ((num1 > 21) && (num2 > 21)) {
            System.out.println("0");
        } else if (num2 > 21) {
            System.out.println(num1);
        }  else if (num1 > 21) {
            System.out.println(num2);
        }  else if (num1 >= num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
