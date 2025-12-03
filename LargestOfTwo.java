import java.util.Scanner;

public class LargestOfTwo 
{
    public static void Largest(int num1, int num2)
    {
        if (num1 > num2) 
        {
            System.out.println("Number1 is greater than nmber2!");    
        }
        else
        {
            System.out.println("Number2 is greater than number1!");
        }
    }    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number1 :");
        int n1 = sc.nextInt();

        System.out.println("Enter number2 :");
        int n2 = sc.nextInt();

        System.out.println("Largest of 2 is :");
        Largest(n1, n2);
    }
}
