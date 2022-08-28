import java.util.Scanner;

public class Q9 {
    public static void main(String[]args){
        int a,c,sum,difference,distance;
        double avarag;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first value=");
        a=input.nextInt();
        System.out.println("Enter second value=");
        c=input.nextInt();
        sum=a+c;
        difference=a-c;
        avarag=sum/2;
        distance=difference;
        System.out.println("sum="+sum);
        System.out.println("difference ="+difference);
        System.out.println("avrage ="+avarag);
        if(distance>0){System.out.println("distance="+difference);}
        if(distance<0){System.out.println("distance="+(-1*difference));}
        if(a>c){System.out.println("the Maximum="+a);}
        if(c>a){System.out.println("the Maximum="+c);}
        if(a<c){System.out.println("the Maximum="+a);}
        if(c<a){System.out.println("the Maximum="+c);}

}}
