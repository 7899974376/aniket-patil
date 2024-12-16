package full;

import java.util.Scanner;

public class Lof3nestdif {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        num1=sc.nextInt();

        System.out.println("enter the number");
        num2=sc.nextInt();

        System.out.println("enter the number");
        num3=sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is largest");
            }
            else{
                System.out.println("num3 is largest");
            }
        }
        else if(num2>num3){
            System.out.println("num2 is largest");
        }
        else{
            System.out.println("num3 is largest");
        }
    }
    
}
