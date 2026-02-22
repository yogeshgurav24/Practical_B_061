import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sum += i;
            }
        }

        System.out.println("Even Numbers: " + evenList);

        System.out.println("Three Minimum: "
                + evenList.get(0) + ", "
                + evenList.get(1) + ", "
                + evenList.get(2));

        int size = evenList.size();

        System.out.println("Three Maximum: "
                + evenList.get(size - 3) + ", "
                + evenList.get(size - 2) + ", "
                + evenList.get(size - 1));

        double average = (double) sum / evenList.size();
        System.out.println("Average: " + average);
    }
}
