import org.example.Konto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    String iban1 = "DE08700901001234567890"; //korrekte IBAN
    Konto konto1 = new Konto(iban1);
    // IBAN richtig übernommen
    @Test
    public void testIBANUebernommen() {
        assertEquals("DE08700901001234567890", konto1.getIban());
    }
    // Kontostand am Anfang 0
    @Test
    public void testKontostandAmAnfang() {
        assertEquals(0, konto1.getKontostand());
    }
    // einzahlen
    @Test
    public void testEinzahlen() {
        konto1.einzahlen(200);
        assertEquals(200.00, konto1.getKontostand());
    }
    // auszahlen
    @Test
    public void testAuszahlen() {
        konto1.einzahlen(200);
        konto1.auszahlen(150);
        assertEquals(50.00, konto1.getKontostand());
    }
    // auszahlen Rückgabe true
    @Test
    public void testAuszahlenTrue() {
        konto1.einzahlen(200);
        assertTrue(konto1.auszahlen(150));
    }

    // auszahlen Rückgabe false
    @Test
    public void testAuszahlenFalse() {
        konto1.einzahlen(200);
        assertFalse(konto1.auszahlen(250));
    }
    // auszahlen, wenn Betrag auf Konto zu gering
    @Test
    public void testUeberziehe() {
        konto1.einzahlen(200);
        konto1.auszahlen(250);
        assertEquals(200, konto1.getKontostand());
    }
    @Test
    public void testNegativeEingabe() {
        konto1.einzahlen(-50);
        konto1.auszahlen(-110);
        assertEquals(0, konto1.getKontostand());
    }
}