import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evennumbers = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            numbers.add(input.nextInt());
            if (numbers.get(i) % 2 == 0) {
                evennumbers.add(numbers.get(i));
            }
        }
        System.out.println(evennumbers);
    }
}