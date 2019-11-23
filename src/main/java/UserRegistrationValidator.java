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




}
