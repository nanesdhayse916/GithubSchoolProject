import java.util.Random; 
public class RandomNumber { 
public static void main(String args[]) { 
int low = 10; int high = 20; 
Random r = new Random(); 
System.out.println("Random number between "+low+" and "+high+":"); 
System.out.println(r.nextInt(high-low)+low); } }