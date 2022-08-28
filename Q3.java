import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
    double length,width,area,perimeter;
    Scanner input=new Scanner(System.in);
    System.out.println("enter length =");
    length=input.nextDouble();
    System.out.println("enter width =");
    width=input.nextDouble();
    area=width*length;
    perimeter=2*(length*width);
    System.out.println("area of rectangle ="+area);
    System.out.println("The prrimeter of rectangle ="+perimeter);

}}
