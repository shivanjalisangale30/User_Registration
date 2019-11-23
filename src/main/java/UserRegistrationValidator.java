import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidator
{
    public static  boolean validateFirstName(String firstName)
    {
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
        Matcher match = firstNamePattern.matcher(firstName);

        if(match.matches())
            return true;
        else
            return false;

    }

    public static  boolean validateLasttName(String lastName)
    {
        Pattern lastNamePattern = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
        Matcher match = lastNamePattern.matcher(lastName);

        if(match.matches())
            return true;
        else
            return false;

    }

    public static  boolean validateMobileNumber(String mobileNumber)
    {
        Pattern mobileNumberPattern = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}$");

        Matcher match = mobileNumberPattern.matcher(mobileNumber);

        if(match.matches())
            return true;
        else
            return false;

    }

    public static  boolean validateEmailId(String emailId)
    {
        Pattern emailIdPattern = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}$");

        Matcher match = emailIdPattern.matcher(emailId);

        if(match.matches())
            return true;
        else
            return false;

    }






}
