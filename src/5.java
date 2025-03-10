import java.util.*;
public class RandomCode {
    public static void main(String[] args) {
        Random r = new Random();
        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);
        System.out.println("The result of " + n1 + " * " + n2 + " is:");
        System.out.println(n1 * n2);
    }
}