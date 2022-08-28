import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        int a,b,c;
         Scanner iput=new Scanner(System.in);
        System.out.println("Enter first value =");
        a= iput.nextInt();
        System.out.println(" Enter second value =");
        b=iput.nextInt();
        c=b;
        b=a;
        a=c;
        System.out.println("after swap ");
        System.out.println(" first value is ="+ a);
        System.out.println("second value is ="+b);

    }
}
