//Write a JAVA program to check whether a number is palindrome or not.
import java.util.*;
class Palindrome
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int no,b,rev=0,c;
      System.out.println("Enter any number:");
      no=sc.nextInt();
      c=no;
      while(no!=0)
        {
          b=no%10;
          rev=rev*10+b;
          no=no/10;
          
        }
      if(c==rev)
        System.out.println("Num is palindrome");
      else
        System.out.println("Num is not a palindrome");
    }
  }