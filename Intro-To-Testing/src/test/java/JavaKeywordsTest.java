import com.ironhack.IntroToTesting.JavaKeywords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaKeywordsTest {

    @Test
    void javaKeywords_containKeyword_trueStatement(){
        String example = "Don't break my heart";
        assertTrue(JavaKeywords.findingKeywords(example));
    }
    @Test
    void javaKeywords_noContainKeyword_trueStatement(){
        String example = "I love to breakdance";
        assertFalse(JavaKeywords.findingKeywords(example));
    }
}
