public class HalfPyramid {

    public static void main(String[] args) {
	
	        // -------------------------------
        // 2. Right Half Star Pyramid
        // -------------------------------

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

        // Space between patterns
	// -------------------------------
        // 1. Inverted Number Half Pyramid
        // -------------------------------

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