import java.util.Scanner;

public class Pattern15 
{
    public static void pattern15(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(char ch = 'A'; ch<='A' + n-i-1; ch++)
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
        pattern15(num);
    }    
}
