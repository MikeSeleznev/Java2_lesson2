/**
 * @author ilnaz-92@yandex.ru
 * Created on 14/02/2019
 */
public class CustomException extends RuntimeException
{
  private String field;

  public CustomException(String field)
  {
    this.field = field;
  }

  public CustomException()
  {
  }

  public void sendInfo()
  {

  }
}
