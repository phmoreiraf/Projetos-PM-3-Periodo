package tdd1;

//import java.io.*;
import java.util.*;
//import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        //LocalTime tempo;

        int horas, minutos, segundos;
        int horasAdd, minutosAdd, segundosAdd;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Relogio:");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Definir hora");
            System.out.println("2. Reiniciar para meia-noite");
            System.out.println("3. Iniciar cronômetro");
            System.out.println("4. Obter tempo decorrido");
            System.out.println("5. Atualizar tempo");
            System.out.println("6. Imprimir formato 24h");
            System.out.println("7. Imprimir formato AM/PM");
            System.out.println("8. Atualizar pelo Sistema");
            System.out.println("0. Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a hora, minutos e segundos separados por espaço:");
                    horas = sc.nextInt();
                    minutos = sc.nextInt();
                    segundos = sc.nextInt();
                    //tempo = relogio.definirHora(horas, minutos, segundos);
                    relogio.definirHora(horas, minutos, segundos);
                    System.out.println("Hora: " + relogio.obterHora());
                    break;
                case 2:
                    relogio.reiniciarMeiaNoite();
                    break;
                case 3:
                    relogio.iniciarCronometro();
                    System.out.println("Cronômetro iniciado.");
                    break;
                case 4:
                    System.out.println("Tempo decorrido: " + relogio.obterTempoDecorrido());
                    break;
                case 5:
                    System.out.println("Digite as horas, minutos e segundos a serem adicionados:");
                    horasAdd = sc.nextInt();
                    minutosAdd = sc.nextInt();
                    segundosAdd = sc.nextInt();
                    relogio.atualizarTempo(horasAdd, minutosAdd, segundosAdd);
                    break;
                case 6:
                    System.out.println("Formato 24h: " + relogio.imprimirFormato24h());
                    break;
                case 7:
                    System.out.println("Formato AM/PM: " + relogio.imprimirFormatoAMPM());
                    break;
                case 8:
                    relogio.atualizarTempoSistema();
                    System.out.println("Tempo atualizado pelo Sistema: " + relogio.obterHora());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
