import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        a=sc.nextInt();

        if(a%2==0)
            System.out.print("even");
        else
        System.out.print("odd");
    }
    
}
