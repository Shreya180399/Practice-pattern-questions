import java.util.Scanner;

public class Pattern20 
{
    public static void pattern1(int n)
    {
        int iniS = 8;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1;j <=iniS; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            iniS = iniS-2;
            System.out.println();
        }
    }    
    public static void pattern2(int n)
    {
        int iniS = 2;
        for(int i=0; i<n-1; i++)
        {
            for(int j=1; j<n-i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=iniS; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<n-i; j++)
            {
                System.out.print("*");
            }
            iniS = iniS+2;
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("Pattern is:");
        pattern1(num);
        pattern2(num);
    }  
}
