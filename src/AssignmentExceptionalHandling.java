import java.util.Scanner;

public class AssignmentExceptionalHandling {
    public static void main(String[] args) {

    }
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the integer");
        String str=sc.nextLine();
        try{
            int x=Integer.parseInt(str);
            System.out.println("this is square of the number"+x*x);
            System.out.println("The work has been done successfully");
        }
        catch(NumberFormatException u){
            System.out.println("Enter number 9is not valid format for an integer"+u);
        }
        sc.close();
    }
}
