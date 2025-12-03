import java.util.Scanner;

public class Pattern8 
{
    public static void pattern8(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j< 2*n -(2*i+1); j++)
            {
                System.out.print("*");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
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
        pattern8(num);
    } 
}
