import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party (case sensitive):");
        System.out.println("D - democrat");
        System.out.println("R - republican");
        System.out.println("I - independent");
        System.out.print("Other Choice: ");

        char choice = scanner.next().charAt(0);

        if (choice == 'D')
        {
            System.out.println("You get a Democratic Donkey! ");
        }

        else if (choice == 'R')
        {
            System.out.println("You get a Republican Elephant! ");
        }

        else if (choice == 'I')
        {
            System.out.println("You get an Independent Person! ");
        }

        else
        {
            System.out.println("You get an other party! ");
        }

        scanner.close();




    }
}