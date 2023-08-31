package tdd1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
//import java.util.Timer;

public class Relogio {

    private LocalTime tempoInicial;
    private LocalTime tempoAtual;

    public Relogio() {
        this.tempoInicial = LocalTime.of(0, 0, 0);
        this.tempoAtual = LocalTime.of(0, 0, 0);
    }

    public LocalTime definirHora(int horas, int minutos, int segundos) {
      return tempoAtual;
    }


}
