import java.util.*;

public class Factorial{

    static int factorial(int num){
    if (num == 0 || num == 1){
        return 1;
        // System.out.println("Factorial not Possible");
    }
    else {
        return num * factorial(num-1);
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Factorial is:"+factorial(num));
}
}