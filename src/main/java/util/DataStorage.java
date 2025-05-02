package main.java.util;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Aluno;

public class DataStorage {
    private List<Aluno> alunos = new ArrayList<>();

    // Simula um banco de dados em memória
    public void salvarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> carregarAlunos() {
        return new ArrayList<>(alunos); // Retorna cópia para evitar modificações externas
    }

    public boolean existeAluno(String matricula) {
        return alunos.stream().anyMatch(a -> a.getMatricula().equals(matricula));
    }

    public Aluno buscarAluno(String matricula) {
        return alunos.stream()
            .filter(a -> a.getMatricula().equals(matricula))
            .findFirst()
            .orElse(null);
    }

    public void atualizarAluno(Aluno alunoAtualizado) {
        alunos.removeIf(a -> a.getMatricula().equals(alunoAtualizado.getMatricula()));
        alunos.add(alunoAtualizado);
    }
}
