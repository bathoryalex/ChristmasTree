/**
 * Created by bathoryalex on 16/10/06.
 */
public class Tree
{
    public static void treePrinter(String yourWord)
    {
        char[] charArray = yourWord.toCharArray();
        for (int i = 0; i < charArray.length ; i++)
        {
            for (int j = 0; j < charArray.length-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)+1  ; k++)
            {
                System.out.print(charArray[i]);
            }
            System.out.println();
        }
    }
}