public class FullPyramid {

    public static void main(String[] args) {

        int rows = 5;

        // -------------------------
        // Upper Part (Alphabet Pyramid)
        // -------------------------

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print alphabets
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }

        // -------------------------
        // Lower Part (Star Pyramid)
        // -------------------------

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = rows; star >= i; star--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}