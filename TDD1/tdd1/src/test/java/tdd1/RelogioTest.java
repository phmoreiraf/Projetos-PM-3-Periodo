package tdd1;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.time.Duration;
import java.time.LocalTime;
//import java.time.DateTimeException;
//import java.lang.NullPointerException;;

public class RelogioTest {

    Relogio relogio = new Relogio();

    @Test
    public void testDefinirHora() {
        relogio.definirHora(10, 30, 10);
        assertEquals("10:30:10", relogio.obterHora());
    }
}


