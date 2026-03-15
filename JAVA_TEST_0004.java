public class JAVA_TEST_0004 {
    public static void main(String[] args) {
        int n = 4; // controls size

        int size = 2 * n - 1; // grid size = 7

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                // distance from each edge
                int top    = i;
                int bottom = size - i + 1;
                int left   = j;
                int right  = size - j + 1;

                // minimum distance from border
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min + 1) + " ");
            }
            System.out.println();
        }
    }
}