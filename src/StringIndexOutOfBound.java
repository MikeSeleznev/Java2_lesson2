/**
 * @author ilnaz-92@yandex.ru
 * Created on 14/02/2019
 */
public class StringIndexOutOfBound
{
  public static void main(String args[])
  {
    try
    {
      String a = "This is like chipping "; // length is 22
      char c = a.charAt(24); // accessing 25th element
      System.out.println(c);
    }
    catch (StringIndexOutOfBoundsException e)
    {
      System.out.println("StringIndexOutOfBoundsException");
    }
  }
}
