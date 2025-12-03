import java.util.Scanner;

public class Pattern16 
{
    public static void pattern16(int n)
    {
        for(int i=0; i<n; i++)
        {
           char ch = (char) ('A' + i);
           for(int j=0; j<=i; j++)
           {
                System.out.print(ch);
           }
           System.out.println();
        }
    } 
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("Pattern is:");
        pattern16(num);
    }     
}
