import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNumber = rand.nextInt((10 - 1) + 1) + 1;
    System.out.println("The generated random number is: " + randomNumber);
  }
}
