import java.util.Scanner;

public class NumberOfVowels 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String str = sc.nextLine();

        int cnt = 0;

        str.toLowerCase();

        for(int i=0; i<str.length()-1; i++)
        {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                cnt++;    
            }
        }

        System.out.println("Number of vowels are :" + cnt);
    }
    
}