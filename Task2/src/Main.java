import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("please type your name");

         Scanner scan = new Scanner(System.in);
         String name = scan.nextLine();

        System.out.println("your name is " + name);

        System.out.println("please type your age next.");
        int age = scan.nextInt();
        System.out.println("your age is " + age);
        int retirement = 67;
        System.out.println("Retirement age is which means you have " +(retirement-age) + " years left before retirement");
    }


}
