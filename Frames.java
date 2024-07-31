import java.util.Scanner;
public class Frames
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        int p=2*(a+b)*c;
        System.out.printf("%d",p);
    }
}