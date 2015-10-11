package be.quodlibet.lambdadynamodbscaler;

import com.amazonaws.services.lambda.runtime.Context;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Dries Horions <dries@quodlibet.be>
 */
public class ScalerTest
{
    public ScalerTest()
    {
    }
    /**
     * Test of scale method, of class Scaler.
     */
    @Test
    public void testScale()
    {
        System.out.println("scale");
        Context context = null;
        Scaler instance = new Scaler();
        Object expResult = null;
        Response result = instance.scale(null, context);
        assertTrue(result.getSuccess());
    }

}
