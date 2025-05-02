package main.java.controller;

import java.util.List;

import main.java.model.Aluno;
import main.java.util.DataStorage;

public class AlunoController {
    private DataStorage storage;

    public AlunoController(DataStorage storage) {
        this.storage = storage;
    }

    // Cadastra um novo aluno (verifica duplicata por matrícula)
    public boolean cadastrarAluno(String matricula, String nome, String curso, boolean especial) {
        if (storage.existeAluno(matricula)) {
            return false;
        }
        Aluno aluno = new Aluno(matricula, nome, curso, especial);
        storage.salvarAluno(aluno);
        return true;
    }

    // Lista todos os alunos cadastrados
    public List<Aluno> listarAlunos() {
        return storage.carregarAlunos();
    }

    // Tranca o semestre de um aluno
    public boolean trancarSemestre(String matricula) {
        Aluno aluno = storage.buscarAluno(matricula);
        if (aluno == null) return false;
        
        aluno.trancarSemestre();
        storage.atualizarAluno(aluno);
        return true;
    }
}
