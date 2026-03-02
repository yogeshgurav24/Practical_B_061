import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum = 0;

        // Find even numbers between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sum += i;
            }
        }

        // Display list
        System.out.println("List of Even Numbers (1 to 100):");
        System.out.println(evenList);

        // Minimum even number
        int min = evenList.get(0);
        System.out.println("Minimum Even Number: " + min);

        // Maximum even number
        int max = evenList.get(evenList.size() - 1);
        System.out.println("Maximum Even Number: " + max);

        // Total sum
        System.out.println("Total Sum of Even Numbers: " + sum);
    }
}