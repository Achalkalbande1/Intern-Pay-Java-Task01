public class NamedLoopExample {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of the outer loop.");
                    break outerLoop;  // This will break out of the outer loop
                }
            }
        }
    }
}
