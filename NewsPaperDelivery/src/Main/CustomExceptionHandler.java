package Main;

public class CustomExceptionHandler extends Exception {


    String message;


    public CustomExceptionHandler(String errMessage)
    {
        message = errMessage;
    }


    public String getMessage()
    {
        return message;
    }

}