import com.ironhack.IntroToTesting.Elf;
import com.ironhack.IntroToTesting.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Elf elf;
    @BeforeEach
    void setUp(){
        elf = new Elf(100, 30, 5, 18);
    }
    @Test
    void elfConstructor_workingRight(){
        assertEquals(100, elf.getHealth());
        assertEquals(30, elf.getStrength());
        assertEquals(5, elf.getLives());
        assertEquals(18, elf.getSpeed());
    }

    @Test
    void decrementLives_checkAllAboutLivesOfWizard(){
        elf.setHealth(0);
        elf.decrementLive();
        assertEquals(4, elf.getLives());
        assertEquals(100, elf.getHealth());

        elf.setLives(1);
        elf.decrementLive();
        assertEquals(0, elf.getLives());
        assertEquals(0, elf.getHealth());
    }

    @Test
    void checkHealth_decrementLive(){
        elf.setHealth(0);
        elf.checkHealth();
        assertEquals(4, elf.getLives());
    }
    @Test
    void attack_checkAttackWorking(){
        Elf elf2 = new Elf(31, 30, 5, 18);
        elf.attack(elf2);
        assertEquals(1, elf2.getHealth());

        Elf elf3 = new Elf(30, 30, 5, 18);
        elf.attack(elf3);
        assertEquals(0, elf3.getHealth());
        elf3.checkHealth();
        assertEquals(4, elf3.getLives());
        assertEquals(30, elf3.getHealth());
    }
}
