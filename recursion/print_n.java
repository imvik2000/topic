import java.util.Scanner;

public class print_n
{
 public static void print_num(int n)
 {
     if(n==0)
     {
         return;
     }
     System.out.println(n);
     print_num(n-1);
     //System.out.println(n);
 }


    public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    int n;
    n=sc.nextInt();
    
    print_num(n);
sc.close();
}

}