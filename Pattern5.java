import java.util.Scanner;

public class Pattern5 
{
    public static void pattern5(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j< n-i+1; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("The pattern is :");
        pattern5(num);
    } 
}
