package full;

import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Double num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextDouble();

        if(num>0)
            System.out.println("number is positive");
        else
            System.out.println("neg");

    }
    
}
