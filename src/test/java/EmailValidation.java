import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidation
{
    private String emailId;
    private boolean expectedValue;
    private UserRegistrationValidator userRegistration;

    public EmailValidation(String string, boolean expectedValue, UserRegistrationValidator userRegistration)
    {
        this.emailId = emailId;
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
                {"abc@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc.100@abc.com.au", true},
                {"abc+100@gmail.com", true},
                {"abc.abc@gmail.co.in", true},
                {"abc100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@g.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@a.com.21a", false},
                {"abc@g.cim.au.au", false}};

        return Arrays.asList(data);
    }

    @Test
    public void testEmailValidation()
    {
      Boolean result = userRegistration.validateEmailId(this.emailId);
      Assert.assertEquals(this.expectedValue,result);
    }
}
