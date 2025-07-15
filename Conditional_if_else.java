import java.util.*;
public class Conditional_if_else {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            int age=sc.nextInt();

            if(age>=18){
                System.out.println("You are eligible to vote"+age);
            }
            else{
                System.out.println("You are not eligible to vote");

            }
            sc.close();
        }
    }
}
