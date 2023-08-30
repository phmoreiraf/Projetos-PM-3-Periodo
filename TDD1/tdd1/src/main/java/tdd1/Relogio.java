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
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Invalid time values");
        }
        this.tempoAtual = LocalTime.of(horas, minutos, segundos);
        //System.out.println(this.tempoAtual + " Hora definida!");
        return tempoAtual;
    }

    public String obterHora() {
        return tempoAtual.toString();
    }

    public void reiniciarMeiaNoite() {
        tempoAtual = LocalTime.of(0, 0, 0);
    }

    public void iniciarCronometro() {
        tempoInicial = LocalTime.now();
    }

    public Duration obterTempoDecorrido() {
        return Duration.between(tempoInicial, tempoAtual);
    }

    public void atualizarTempo(int horas, int minutos, int segundos) {
        tempoAtual =  definirHora(horas, minutos, segundos);
        System.out.println(tempoAtual + " tempo atualizado!");
    }

    public String imprimirFormato24h() {
        return tempoAtual.toString();
    }

    public String imprimirFormatoAMPM() {
        return tempoAtual.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
    }

    public void atualizarTempoSistema() {
        tempoAtual = LocalTime.now();
    }

}
