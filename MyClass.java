
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        int c = 0;
        while (sum(a) > b) {
            a++;
            c++;
        }
        System.out.println(c);
    }

    public static long sum(long a) {
        long s = 0;
        while (a > 0) {
            s = s + a % 10;
            a = a / 10;
        }
        return (s);
    }
}