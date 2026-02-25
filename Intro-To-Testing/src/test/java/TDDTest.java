import com.ironhack.IntroToTesting.TDD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDTest {
    @Test
    void returnArray_correctArray_fromOneToN(){
        int[] result = TDD.returnArray(10);
        for (int i=1; i<=10; i++){
            assertEquals(i, result[i-1]);
        }
    }
}
