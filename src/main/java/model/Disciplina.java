package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int vagasTotal;
    private int vagasOcupadas;
    private List<String> preRequisitos; // Lista de códigos de disciplinas pré-requisito

    public Disciplina(String codigo, String nome, int vagasTotal) {
        this.codigo = codigo;
        this.nome = nome;
        this.vagasTotal = vagasTotal;
        this.vagasOcupadas = 0;
        this.preRequisitos = new ArrayList<>();
    }

    public boolean temVagas() {
        return vagasOcupadas < vagasTotal;
    }

    public void ocuparVaga() {
        if (temVagas()) {
            vagasOcupadas++;
        }
    }

    public void liberarVaga() {
        if (vagasOcupadas > 0) {
            vagasOcupadas--;
        }
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getVagasDisponiveis() { return vagasTotal - vagasOcupadas; }
    public List<String> getPreRequisitos() { return preRequisitos; }

    public void adicionarPreRequisito(String codigoDisciplina) {
        preRequisitos.add(codigoDisciplina);
    }
}
