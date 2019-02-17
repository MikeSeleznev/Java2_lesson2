/**
 * @author ilnaz-92@yandex.ru
 * Created on 14/02/2019
 */
public class ArithmeticExceptionExample
{
  public static void main(String args[])
  {
    try
    {
      int a = 30, b = 0;
      int c = a / b;  // cannot divide by zero
      System.out.println("Result = " + c);
    }
    catch (ArithmeticException e)
    {
      System.out.println("Can't divide a number by 0");
    }
  }
}
