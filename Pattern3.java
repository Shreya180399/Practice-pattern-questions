import java.util.Scanner;

public class Pattern3 
{
    public static void pattern3(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j +" ");
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
        pattern3(num);
    }
}
