package src.iut.bad;

import junit.framework.TestCase;

public class HumainTest extends TestCase {
    private Humain humain;

    protected void setUp() { humain = new Humain(); }

    public void testDetails() {
        humain.setNom("RAKOTO");
        humain.setPrenom("Donovan");
        humain.setAge(18);
        humain.details();
        assertNotNull(humain);
    }

    public void testToString() {
        humain.setNom("RAKOTO");
        humain.setPrenom("Donovan");
        humain.setAge(18);
        String result = humain.toString();
        assertEquals("Nom : RAKOTO\nPrenom : Donovan\nAge : 18", result);
    }

    public void testAmi() {
        Humain humain2 = new Humain("NOM", "BB", 15);
        humain.setNom("NAME");
        humain.setPrenom("EE");
        humain.setAge(11);
        String result = humain.ami(humain2, 69);
        assertEquals("NAME est ami de NOM depuis 69 jours.", result);
    }

    protected void tearDown() { humain = null;}
}
