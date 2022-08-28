import java.util.Scanner;
import  java.util.Locale;
public class Q7 {

    public static void main(String[] args){
         String a="Afaf";
         System.out.println(a);
         //طباعة  الحرف الاول
        System.out.println(a.charAt(0));
       // ازالة الحرف الاول
        System.out.println(a.substring(1));
        //طباعة الحرف الاخير
        System.out.println(a.charAt(4));
        //حذف الحرف الاخير
        System.out.println(a.replaceAll("f",""));
    }

}
