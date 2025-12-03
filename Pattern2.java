import java.util.Scanner;

public class Pattern2 
{
    public static void pattern2(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }  
    
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("The pattern is:");
        pattern2(num);
    }
}
