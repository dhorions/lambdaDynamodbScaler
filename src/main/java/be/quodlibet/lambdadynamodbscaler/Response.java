package be.quodlibet.lambdadynamodbscaler;

/**
 *
 * @author Dries Horions <dries@quodlibet.be>
 */
public class Response
{
    Boolean success;
    String message;

    public Boolean getSuccess()
    {
        return success;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Response(Boolean success, String message)
    {
        this.success = success;
        this.message = message;
    }

}
