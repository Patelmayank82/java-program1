// import java.util.*;

// public class Decrease {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter first number: ");
//     int num1 = sc.nextInt();

//     System.out.println("Enter second number: ");
//     int num2 = sc.nextInt();

//     System.out.println("Enter third number: ");
//     int num3 = sc.nextInt();

//     int maxNum = Math.max(Math.max(num1, num2), num3);
//     int minNum = Math.min(Math.min(num1, num2), num3);
//     int middleNum = num1 + num2 + num3 - maxNum - minNum;

//     System.out.println("Numbers in decreasing order: " + maxNum + " " + middleNum + " " + minNum);
//   }
// }

import java.util.*;

public class Decrease {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("Enter third number: ");
    int num3 = sc.nextInt();

    int maxNum, middleNum, minNum;

    if (num1 >= num2) {
      if (num1 >= num3) {
        maxNum = num1;
        if (num2 >= num3) {
          middleNum = num2;
          minNum = num3;
        } else {
          middleNum = num3;
          minNum = num2;
        }
      } else {
        maxNum = num3;
        middleNum = num1;
        minNum = num2;
      }
    } else {
      if (num2 >= num3) {
        maxNum = num2;
        if (num1 >= num3) {
          middleNum = num1;
          minNum = num3;
        } else {
          middleNum = num3;
          minNum = num1;
        }
      } else {
        maxNum = num3;
        middleNum = num2;
        minNum = num1;
      }
    }

    System.out.println("Numbers in decreasing order: " + maxNum + " " + middleNum + " " + minNum);
  }
}

