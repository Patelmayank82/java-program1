import java.io.*;
import java.util.*;

class Student {
    public static void main(String[] args){
        System.out.println("Student inpretion");

        try{
            FileOutputStream fout = new FileOutputStream("C:\Users\Mayank\Documents\.first");
            Scanner sc = new Scanner();
            System.out.println("Student inpretion");
            String name = sc.nextLine();
            String sum = sc.nextLine();
            String EnrollNum = sc.nextLine();
            String str = "Name:"+ name + "\n" + "Sum" + sum + "\n" + "Enrollment no:" + EnrollNum;
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();        
       }
       catch(exception e){
            System.out.println("Error" + e);
       }
    }
}