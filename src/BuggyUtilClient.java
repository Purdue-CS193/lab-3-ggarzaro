
import java.util.Scanner;

public class BuggyUtilClient {
    public static void main(String[] args) {
        // First test case in Main
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Name:");

        String FirstName = scanner.nextLine();

        System.out.println("Enter Last Name:");

        String LastName = scanner.nextLine();

        String FN = FirstName.substring(0,1);
        String LN;

        if (LastName.length() > 8) {
            LN = LastName.substring(0, 7);
        } else {
            LN = LastName;
        }
     
        System.out.println("Out: "+FN+LN);

    }
}


