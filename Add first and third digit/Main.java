import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int first_digit=num/100;
    int three_digit=num%10;
    int sum=first_digit+three_digit;
    System.out.println(sum);
  }
}