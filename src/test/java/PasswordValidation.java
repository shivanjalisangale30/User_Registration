import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidation
{
    private String password;
    private boolean expectedValue;
    private UserRegistrationValidator userRegistration;

    public PasswordValidation(String string, boolean expectedValue, UserRegistrationValidator userRegistration)
    {
        this.password = password;
        this.expectedValue = expectedValue;
    }

    @Before
    public static void initialize()
    {
        UserRegistrationValidator userRegistration =new UserRegistrationValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]{
                {"Shivanjali30&", true},
                {"@123shivanJali", true},
                {"Shivanjali123&", true},
                {"@#$123Shivanjali", true},
                {"shivanJali$$22", true},
                {"sHIVANJAlI123$", true},
                {"shivanjali123$", false},
                {"Shivanjali123", false},
                {"shivanjalL$$", false},
                {"@@@123", false},
                {"shivanjali", false},
                {"789654123", false},
                {"SHIVANJALI", false},
                {"SHIVANJALi123@", true}};

        return Arrays.asList(data);
    }
    @Test
    public void testPasswordValidation()
    {
        Boolean result = userRegistration.validatePassword(this.password);
        Assert.assertEquals(this.expectedValue,result);
    }

}
