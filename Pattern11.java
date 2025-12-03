import java.util.Scanner;

public class Pattern11 
{
    public static void pattern11(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if (j%2 == 0) 
                {
                    System.out.print("1");    
                }
                else
                {
                    System.out.print("0");
                }
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
        pattern11(num);
    }  
}
