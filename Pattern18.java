import java.util.Scanner;

public class Pattern18 
{
    public static void pattern18(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(char ch = (char) ('E' - i); ch<='E'; ch++)
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
        pattern18(num);
    }  
}
