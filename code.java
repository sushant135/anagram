import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
       String strOne, strTwo;
       int lenOne, lenTwo, i, j, found=0, not_found=0;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter the First String: ");
       strOne = scan.nextLine();
       System.out.print("Enter the Second String: ");
       strTwo = scan.nextLine();
       
       lenOne = strOne.length();
       lenTwo = strTwo.length();
      
       if(lenOne == lenOne)
       {
           for(i=0; i<lenOne; i++)
           {
               found = 0;
               for(j=0; j<lenOne; j++)
               {
                   if(strOne.charAt(i) == strTwo.charAt(j))
                   {
                       found = 1;
                       break;
                   }
               }
               if(found == 1)
               {
                   not_found = 0;
                   break;
               }
           }
           if(not_found == 0)
               System.out.println("\nStrings are not Anagram");
           else
               System.out.println("\nStrings are Anagram");
       }
       
       else
           System.out.println("\nLength of Strings Mismatched!");
   }
}
