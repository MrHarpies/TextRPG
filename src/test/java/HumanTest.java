import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human = new Human();



    @Test
    void setHealth() {
        Mage mage = new Mage();
        Assertions.assertEquals(100,mage.getHealth());
        Assertions.assertEquals(10, mage.getIntelligence());

    }

    @Test
    void setDefense() {
    }

    @Test
    void setStrenght() {
    }

    @Test
    void setIntelligence() {
    }

    @Test
    void setCrit_chance() {
    }

    @Test
    void setCrit_damage() {
    }
}