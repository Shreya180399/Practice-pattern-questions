import java.util.Scanner;

public class StringProgram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String str = sc.nextLine();

        System.out.println("Length of the string is :");
        for(int i=0; i<str.length() - 1; i++)
        {
            System.out.println();
        }
    }    
}
