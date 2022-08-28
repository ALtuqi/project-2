import java.util.Scanner;

public class Q5 {
    public static void main (String[] args){
        double d,k,m,sum,avarage;
       Scanner input=new  Scanner(System.in);
       System.out.println("Enter the fist value ");
       d=input.nextDouble();
       System.out .println("Enter the second value");
       k=input.nextDouble();
       System.out.println("Enter the third vale");
       m=input.nextDouble();
       sum=d+k+m;
       System.out.println("THE SUM IS ="+sum);
       avarage=(d+k+m)%2;
      System.out.println("THE AVARAG IS ="+avarage);
    }
}
