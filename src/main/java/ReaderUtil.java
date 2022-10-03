import java.util.Scanner;

public class ReaderUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        int readNum = scanner.nextInt();
        scanner.nextLine();
        return readNum;
    }

    public static double readDouble() {
        double readNum = scanner.nextDouble();
        scanner.nextLine();
        return readNum;
    }
}
