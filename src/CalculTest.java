package src;
import junit.framework.TestCase;

public class CalculTest extends TestCase {
    private Calcul calcul;

    protected void setUp() {
        calcul = new Calcul();
    }

    public void testAdditionner() {
        int resultat = calcul.additionner(2, 3);
        assertEquals(5, resultat);
    }

    public void testSoustraire() {
        int result = calcul.soustraire(1, 5);
        assertEquals(-4, result);
    }

    public void testSumInt() {
        int sum = calcul.sumInt(9);
        assertEquals(45, sum);
    }

    public void testCheckObj() {
        String result = calcul.checkObj("1", 2);
        assertEquals("Not Same", result);
    }

    protected void tearDown() {
        calcul = null;
    }
}
