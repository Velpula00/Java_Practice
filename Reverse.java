//Write a JAVA program to enter a number and print its reverse.
import java.util.*;
class Reverse{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int no,b,rev=0;
    System.out.println("Enter any number");
    no=sc.nextInt();
    while(no!=0)
      {
        b=no%10;
        rev=rev*10+b;
        no=no/10;
        
      }
    System.out.println("reverse of a num is:"+rev);
  }
  
}
