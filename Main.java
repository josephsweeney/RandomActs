import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String[] initials = {"FN","AH", "SK", "AW", "HH", "ME", "ML", "JF", "JS", "SR", "SB", "LG", "NH", "SS", "SV", "CW" };


       int[] cards = {10, 15, 9, 8, 7, 5, 6, 4, 3, 1, 16, 13, 14, 2, 11, 12};
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter your first and last initial (uppercase)");
            String inputText = sc.nextLine();
            for (int i = 0; i < initials.length; i++)
            {
                if (initials[i].equals(inputText))
                {
                    System.out.println("Card " + cards[i]);
                }
            }
        }
    }
}
