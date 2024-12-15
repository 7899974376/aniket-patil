package full;

import java.util.Scanner;

public class markes {
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the markes:");
        m=sc.nextInt();
        if(m>0)
            if(m>=85 && m<=100)
                System.out.println("A+ distination");
            else if(m>=75 && m<=84)
                System.out.println("A ");
            else if (m>=50 && m<=74)
                System.out.println("B");
            else if(m>=35 && m<=49)
                System.out.println("c");
            else
                System.out.println("fail");
        else
            System.out.println("enter the valid markes");


    }
    
}
