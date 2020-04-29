
public class PointExample {
    public static void main(String[] args) {
        int input = 10;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input + i - 1; j++) {
                if (j >= input - i + 1) { // j>2*input-1 - (i+4) j<=i+4 && j>2*input-1 -(i+4) (j<=i+4)&&(j>2*input-1
                                          // -(i+4))
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        } // 피라미드 쌓기. 개어렵다.

    }

    



    public static void pyramid(int input) {

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input + i - 1; j++) {
                if (j >= input - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}