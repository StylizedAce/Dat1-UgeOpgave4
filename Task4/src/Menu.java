import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

private static ArrayList<String> options;


    public Menu(ArrayList<String> options_ ) {
        options = new ArrayList<>();
this.options = options_;

    }

    public static String showMenu() {
        System.out.println("Type a number to choose");
        for (int i = 0; i < options.size(); i++ )
            System.out.println(options.get(i));

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;
    }

}
