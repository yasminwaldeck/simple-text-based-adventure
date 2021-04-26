import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testName(){
        Player testPlayer = new Player();
        testPlayer.setName("Max");
        assertEquals(testPlayer.getName(), "Max");
    }

    @Test
    public void testXP(){
        Player testPlayer = new Player();
        testPlayer.setXP(46);
        assertEquals(testPlayer.getXP(), 46);
    }

    @Test
    public void testHP(){
        Player testPlayer = new Player();
        testPlayer.setHP(46);
        assertEquals(testPlayer.getHP(), 46);
    }

    @Test
    public void testMaxHP(){
        Player testPlayer = new Player();
        testPlayer.setMaxHP(46);
        assertEquals(testPlayer.getMaxHP(), 46);
    }

    @Test
    public void testLevel(){
        Player testPlayer = new Player();
        testPlayer.setLevel(4);
        assertEquals(testPlayer.getLevel(), 4);
    }

    @Test
    public void testLuck(){
        Player testPlayer = new Player();
        testPlayer.setLuck(99);
        assertEquals(testPlayer.getLuck(), 99);
    }

    @Test
    public void testIsDead(){
        Player testPlayer = new Player();
        testPlayer.setHP(-2);
        assertTrue(testPlayer.isDead());
    }

    @Test
    public void testIsNotDead(){
        Player testPlayer = new Player();
        testPlayer.setHP(2);
        assertFalse(testPlayer.isDead());
    }

}
