public class NumberInvertedPattern {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num > 9) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}