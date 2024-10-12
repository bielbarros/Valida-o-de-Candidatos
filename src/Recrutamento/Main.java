package Recrutamento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Iniciar o processo de seleção
        List<String> candidatosSelecionados = Selecao.selecionarCandidatos();
        System.out.println("Candidatos selecionados: " + candidatosSelecionados);

        // Entrar em contato com os candidatos selecionados
        for (String candidato : candidatosSelecionados) {
            Contato.entrarEmContato(candidato);
        }
    }
}
