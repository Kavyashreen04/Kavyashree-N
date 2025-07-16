
import java.util.Scanner;

public class Problem2{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            {
            System.out.print(i);
            if(i+2<=a)
            System.out.print(", ");
            }
           
        }
    }
}