package src.iut.bad;

import junit.framework.TestCase;

public class HommeTest extends TestCase {
    private Homme homme;

    protected void setUp() { homme = new Homme(); }

    public void testToString() {
        homme.setNom("RABE");
        homme.setPrenom("Patrick");
        homme.setAge(69);
        String result = homme.toString();
        assertEquals("Nom : RABE\nPrenom : Patrick\nAge : 69", result);
    }

    protected void tearDown() { homme = null; }
}
