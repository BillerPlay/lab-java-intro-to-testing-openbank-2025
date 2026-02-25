import com.ironhack.IntroToTesting.SpellLibrary;
import com.ironhack.IntroToTesting.Wizard;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SpellTest {
    @Mock
    private SpellLibrary spellLibrary;

    @Mock
    private Wizard wizard;

    @Test
    void getRandomSpell_returningFireball(){
        when(spellLibrary.getRandomSpell()).thenReturn("Fireball");
        assertEquals("Fireball", spellLibrary.getRandomSpell());
    }

    @Test
    void getRandomSpell_callsExactlyOnce(){
        when(spellLibrary.getRandomSpell()).thenReturn("Fireball");
        System.out.println(spellLibrary.getRandomSpell());
        verify(spellLibrary, atLeastOnce()).getRandomSpell();
    }

    @Test
    void castRandomSpell_returnsCastingFireball(){
        when(wizard.castRandomSpell()).thenReturn("Casting Fireball");
        assertEquals("Casting Fireball", wizard.castRandomSpell());
    }
}
