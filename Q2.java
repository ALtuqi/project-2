import java.util.Scanner;

public class Q2 {
    public static void main(String []args){
        double pi=3.14,area,x,circumference;
        Scanner input=new Scanner(System.in);
        System.out.println("enter redius =");
        x=input.nextDouble();
        area=x*x*pi;
        System.out.println("area ofcircle ="+ area );
        circumference=2*x*pi;
        System.out.println("circumference ="+circumference);
    }
}
