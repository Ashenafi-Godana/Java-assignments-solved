import java.util.Scanner;

/*
Java Program to find the largest and smallest of three numbers
 */
public class CheckSize {
    /*
    * A method to find the largest number
    * @param number1
    * @param number2
    * @param number3
    * @return largest of the three(maximum)
    *
    */
    static int largest(int number1, int number2, int number3) {
        int max = number1;

        if (number2 > max)
            max = number2;
        if (number3 > max)
            max = number3;
        return max;
    }

    /*
    * A method to find the smallest number of three numbers
    * @param number1
    * @param number2
    * @param number3
    * @return smallest of the three(minimum)
    *
    */
    static int smallest(int number1, int number2, int number3) {
        int min = number1;

        if (number2 < min)
            min = number2;
        if (number3 < min)
            min = number3;
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int first = in.nextInt();
        System.out.print("Please enter second number: ");
        int second = in.nextInt();
        System.out.print("Please enter third number: ");
        int third = in.nextInt();

        System.out.println("The largest number is: " + largest(first, second, third));
        System.out.println("The smallest number is: " + smallest(first, second, third));
    }
}
