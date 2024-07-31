import java.util.Scanner;
 public class loss{
     public static void main(String[] args)
     {
         int a,b;
         Scanner read = new Scanner(System.in);
         a = read.nextInt();
         b = read.nextInt();
         double g=((a-b)*100.0/a);
         System.out.printf("%.2f",g);
     }
 }