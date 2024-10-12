package Recrutamento;

import java.util.ArrayList;
import java.util.List;

public class Selecao {

    public static List<String> selecionarCandidatos() {
        String[] nomes = {"FELIPE", "MARCIA", "GUILHERME", "JOÃO", "JOSÉ", "GABRIEL", "MIGUEL", "MIRELA", "FÁBRICIO", "DANIELA"};
        List<String> candidatosSelecionados = new ArrayList<>();
        double salarioBase = 2000.0;

        // Verifica se o salário pretendido do candidato é compatível com o salário base
        for (String nome : nomes) {
            Candidato candidato = new Candidato(nome);
            System.out.println(candidato + " solicitou este valor de salário: " + candidato.getSalarioPretendido());

            if (salarioBase >= candidato.getSalarioPretendido()) {
                System.out.println("O candidato " + candidato.getNome() + " foi selecionado para a vaga.");
                candidatosSelecionados.add(candidato.getNome());

                if (candidatosSelecionados.size() >= 5) {
                    break;
                }
            }
        }

        return candidatosSelecionados;
    }
}

