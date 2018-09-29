import java.util.Scanner;

public class BuggyUtilClient {

    public static void main (String [] arags){
        // First test case in Main
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");

        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");

        String lastName = scanner.nextLine();

        String FN = firstName.substring(0,1);
        String LN;

        if (lastName.length() > 8) {
            LN = lastName.substring(0, 7);
        } else {
            LN = lastName;
        }
        String Username = FN+LN;
        String res = Username.toLowerCase();

        System.out.println("Out: "+res);
       

    }
    
}

