import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;

        // Find even numbers between 1 and 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
                sum += i;
            }
        }

        // Display results
        System.out.println("List of Even Numbers: " + evenNumbers);
        System.out.println("Minimum Even Number: " + evenNumbers.get(0));
        System.out.println("Maximum Even Number: " + evenNumbers.get(evenNumbers.size() - 1));
        System.out.println("Sum of Even Numbers: " + sum);
    }
}
