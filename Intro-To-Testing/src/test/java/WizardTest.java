import com.ironhack.IntroToTesting.Elf;
import com.ironhack.IntroToTesting.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {
    private Wizard wizard;
    @BeforeEach
    void setUp(){
        wizard = new Wizard(100, 30, 5, 18);
    }

    @Test
    void wizardConstructor_workingRight(){
        assertEquals(100, wizard.getHealth());
        assertEquals(30, wizard.getStrength());
        assertEquals(5, wizard.getLives());
        assertEquals(18, wizard.getSpell());
    }

    @Test
    void convertToElf_returnsElf(){
        Elf elf = wizard.convertToElf();
        assertEquals(elf.getHealth(), wizard.getHealth());
        assertEquals(elf.getStrength(), wizard.getStrength());
        assertEquals(elf.getLives(), wizard.getLives());
        assertEquals(elf.getSpeed(), wizard.getSpell());
        assertEquals(100, elf.getHealth());
        assertEquals(30, elf.getStrength());
        assertEquals(5, elf.getLives());
        assertEquals(18, elf.getSpeed());
    }

    @Test
    void decrementLives_checkAllAboutLivesOfWizard(){
        wizard.setHealth(0);
        wizard.decrementLive();
        assertEquals(4, wizard.getLives());
        assertEquals(100, wizard.getHealth());

        wizard.setLives(1);
        wizard.decrementLive();
        assertEquals(0, wizard.getLives());
        assertEquals(0, wizard.getHealth());
    }

    @Test
    void checkHealth_decrementLive(){
        wizard.setHealth(0);
        wizard.checkHealth();
        assertEquals(4, wizard.getLives());
    }
    @Test
    void attack_checkAttackWorking(){
        Wizard wizard2 = new Wizard(31, 30, 5, 18);
        wizard.attack(wizard2);
        assertEquals(1, wizard2.getHealth());

        Wizard wizard3 = new Wizard(30, 30, 5, 18);
        wizard.attack(wizard3);
        assertEquals(0, wizard3.getHealth());
        wizard3.checkHealth();
        assertEquals(4, wizard3.getLives());
        assertEquals(30, wizard3.getHealth());
    }
}
