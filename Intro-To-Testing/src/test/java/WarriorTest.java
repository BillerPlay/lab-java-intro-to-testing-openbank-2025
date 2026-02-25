import com.ironhack.IntroToTesting.Elf;
import com.ironhack.IntroToTesting.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    private Warrior warrior;
    @BeforeEach
    void setUp(){
        warrior = new Warrior(100, 30, 5, 18);
    }

    @Test
    void wizardConstructor_workingRight(){
        assertEquals(100, warrior.getHealth());
        assertEquals(30, warrior.getStrength());
        assertEquals(5, warrior.getLives());
        assertEquals(18, warrior.getForce());
    }

    @Test
    void convertToElf_returnsElf(){
        Elf elf = warrior.convertToElf();
        assertEquals(elf.getHealth(), warrior.getHealth());
        assertEquals(elf.getStrength(), warrior.getStrength());
        assertEquals(elf.getLives(), warrior.getLives());
        assertEquals(elf.getSpeed(), warrior.getForce());
        assertEquals(100, elf.getHealth());
        assertEquals(30, elf.getStrength());
        assertEquals(5, elf.getLives());
        assertEquals(18, elf.getSpeed());
    }

    @Test
    void decrementLives_checkAllAboutLivesOfWizard(){
        warrior.setHealth(0);
        warrior.decrementLive();
        assertEquals(4, warrior.getLives());
        assertEquals(100, warrior.getHealth());

        warrior.setLives(1);
        warrior.decrementLive();
        assertEquals(0, warrior.getLives());
        assertEquals(0, warrior.getHealth());
    }

    @Test
    void checkHealth_decrementLive(){
        warrior.setHealth(0);
        warrior.checkHealth();
        assertEquals(4, warrior.getLives());
    }
    @Test
    void attack_checkAttackWorking(){
        Warrior warrior2 = new Warrior(31, 30, 5, 18);
        warrior.attack(warrior2);
        assertEquals(1, warrior2.getHealth());

        Warrior warrior3 = new Warrior(30, 30, 5, 18);
        warrior.attack(warrior3);
        assertEquals(0, warrior3.getHealth());
        warrior3.checkHealth();
        assertEquals(4, warrior3.getLives());
        assertEquals(30, warrior3.getHealth());
    }
}
