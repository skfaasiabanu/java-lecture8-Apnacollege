import java.util.*;
public class rhombuss
{
    public static void inver(int n)
    {
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            
            }
            
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        inver(n);
    }
}