import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationValidation
{
    UserRegistrationValidator userRegistration = new UserRegistrationValidator();


    //Validation for First Name
    @Test
    public void firstNameValidation_whenInputIsCorrect_shouldReturnTrue()
    {
        boolean result = userRegistration.validateFirstName("Shivanjali");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameValidation_whenInputOnlyLowerCase_shouldReturnFalse()
    {
        boolean result = userRegistration.validateFirstName("shivanjali");
        Assert.assertFalse(result);
    }


    @Test
    public void firstNameValidation_whenInputOnlyUpperCase_shouldReturnTrue()
    {
        boolean result = userRegistration.validateFirstName("SHIVANJALI");
        Assert.assertTrue(result);
    }


    @Test
    public void firstNameValidation_whenInputOnlyNumericValue_shouldReturnFalse()
    {
        boolean result = userRegistration.validateFirstName("9874568");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameValidation_whenInputLessThanThree_shouldReturnFalse()
    {
        boolean result = userRegistration.validateFirstName("Sh");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameValidation_whenFirstLetterNotUpperCase_shouldReturnFalse()
    {
        boolean result = userRegistration.validateFirstName("sHIVANJALI");
        Assert.assertFalse(result);
    }

    //Validation for Last Name
    @Test
    public void lastNameValidation_whenInputIsCorrect_shouldReturnTrue()
    {
        boolean result = userRegistration.validateLasttName("Sangale");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameValidation_whenInputOnlyLowerCase_shouldReturnFalse()
    {
        boolean result = userRegistration.validateLasttName("sangale");
        Assert.assertFalse(result);
    }


    @Test
    public void lastNameValidation_whenInputOnlyUpperCase_shouldReturnTrue()
    {
        boolean result = userRegistration.validateLasttName("Sangale");
        Assert.assertTrue(result);
    }


    @Test
    public void lastNameValidation_whenInputOnlyNumericValue_shouldReturnFalse()
    {
        boolean result = userRegistration.validateLasttName("9874568");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameValidation_whenInputLessThanThree_shouldReturnFalse()
    {
        boolean result = userRegistration.validateLasttName("sa");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameValidation_whenFirstLetterNotUpperCase_shouldReturnFalse()
    {
        boolean result = userRegistration.validateLasttName("sANGAlE");
        Assert.assertFalse(result);
    }

    //Validation for Mobile number
    @Test
    public void mobileNumberValidation_whenWithProperInput_shouldReturnTrue()
    {
        boolean result = userRegistration.validateMobileNumber("91 7896541235");
        Assert.assertTrue(result);
    }

    @Test
    public void  mobileNumberValidation_whenInputWithCountryCode_shouldReturnFalse()
    {
        boolean result = userRegistration.validateMobileNumber("9874563215");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberValidation_whenInpputWithLessThanTenDigit_shouldReturnFalse()
    {
        boolean result = userRegistration.validateMobileNumber("987456");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberValidation_whenInputWithMoreThanTenDigit_shouldReturnFalse()
    {
      boolean result = userRegistration.validateMobileNumber("91 987456321542");
      Assert.assertFalse(result);
    }

    @Test
    public void mobileNuberValidation_whenInputConatinCharacter_shouldReturnFalse()
    {
        boolean result = userRegistration.validateMobileNumber("9874563215s");
        Assert.assertFalse(result);
    }




}
