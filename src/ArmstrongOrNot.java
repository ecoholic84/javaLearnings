import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reminder, cube, temp;
        temp = num;

        int sum = 0;
        while (num > 0) {
            reminder = num % 10;
            cube = reminder * reminder * reminder;
            sum = sum + cube;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Its armstrong.");
        } else {
            System.out.println("Not armstrong.");
        }

    }
}

// check if the number scanned is a armstrong, how?
// split the number into individual digits, calc the cube of each digit and sum it and check if its the number itself
// how to split a number into digits in java?
//lets build the first iteration of this: two number inputs