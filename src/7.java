import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(10);
    System.out.println("Random number: " + randomNum);
  }
}
