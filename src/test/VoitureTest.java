
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class VoitureTest
{
    private final Voiture v1 = new Voiture();

    @Test
    void Test_getMarque(){
        v1.setMarque("BMW");
        assertEquals("BMW", v1.getMarque());
    }

    @Test
    void Test_getPrix(){
        v1.setPrix(500);
        assertEquals(500, v1.getPrix());
    }

    @Test
    void Test_setPrix(){
        v1.setPrix(500);
        assertEquals(v1.getPrix(), 500);
    }

    @Test
    void Test_setMarque(){
        v1.setMarque("FIAT");
        assertEquals(v1.getMarque(),"FIAT" );
    }
}
