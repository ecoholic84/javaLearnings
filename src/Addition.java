import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int v1 = input.nextInt();
        System.out.print("Enter second number: ");
        int v2 = input.nextInt();
        int sum = v1+v2;
        System.out.print("The sum is " + sum + ".");


    }
}
