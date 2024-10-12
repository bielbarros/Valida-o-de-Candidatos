package Recrutamento;

import java.util.Random;

public class Contato {

    public static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.println("Tentando entrar em contato com " + candidato);

        // Tenta entrar em contato até 3 vezes
        do {
            atendeu = simularAtendimento();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                System.out.println("Tentativa " + tentativasRealizadas + " com " + candidato + " falhou.");
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso com " + candidato);
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (!atendeu) {
            System.out.println("Não foi possível contatar " + candidato + " após 3 tentativas.");
        }
    }

    // Simular se o candidato atende ou não de forma aleatória
    private static boolean simularAtendimento() {
        return new Random().nextInt(3) == 1;
    }
}

