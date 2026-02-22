public class AlphabetFullPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print spaces for center alignment
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print alphabets
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }
    }
}