// palindrome number program
// A number is palindrome if its reads same forward and  backward
public class palindrome
  {
    public static void main(String[] args)
    {
      int number=121;
      int original=number;
      int reverse=0;
      while(number>0)
        {
          int last_digit=number%10;
          reverse=reverse*10+last_digit;
          number=number/10;
        }
      if(original==reverse)
      {
        System.out.print("Its palindrome");
      }
      else
      {
        System.out.print("Its not palindrome");
      }
    }
  }
      
