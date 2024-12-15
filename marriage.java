package full;

import java.util.Scanner;

public class marriage {
    public static void main(String[] args) {
        String gender;
        int age;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender male/female:");
        gender=sc.nextLine();

        System.out.println("enter the age");
        age=sc.nextInt();

        if(gender.equals("male")){
            if(age>=21){
                System.out.println("you gender is" +gender+ " you can married");
            }
            else{
                System.out.println("you gender is" +gender+ " you can not married");
            }
        }
        else{
            if(age>=18){
                System.out.println("you gender is" +gender+ " you can married");
            }
            else{
                System.out.println("you gender is" +gender+ " you can not married");
            }
        }

    }
}