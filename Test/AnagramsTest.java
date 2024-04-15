import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AnagramsTest {

        @Test

        public void anagrams() throws Exception {
            assertEquals("y", Anagrams.anagrams("cabbie", "abbey"));
            //System.out.println(Anagrams.anagrams("The cockroach", "Cook, catch her"));
            assertEquals("Anagram", Anagrams.anagrams("The cockroach", "Cook, catch her"));
            assertEquals("Anagram", Anagrams.anagrams("The Hilton", "hint Hotel"));
            assertEquals("d", Anagrams.anagrams("A Serenading Marvel", "Anagrams never lie"));
        }
}


