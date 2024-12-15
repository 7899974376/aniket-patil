package full;

import java.util.Scanner;

public class loginvalidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id;
        String password;

        System.out.println("enter the userid::");
        id=sc.nextLine();

        System.out.println("enter the pasword::");
        password=sc.nextLine();

        if(id.equals("aniket")){
            if(password.equals("123@")){
                System.out.println("login done");
            }
            else{
                System.out.println("login unsuccsfull");
            }
        }
        else{
            System.out.println("login unsucessfull");
        }
        

    }
    
}
