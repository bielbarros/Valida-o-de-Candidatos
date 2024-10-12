package Recrutamento;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {

    private String nome;
    private double salarioPretendido;

    public Candidato(String nome) {
        this.nome = nome;
        this.salarioPretendido = gerarSalarioPretendido();
    }

    // Gerar um salário pretendido aleatório entre 1800 e 2200
    private double gerarSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    @Override
    public String toString() {
        return nome + " (Salário pretendido: " + salarioPretendido + ")";
    }
}
