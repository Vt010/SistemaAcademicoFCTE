package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private boolean especial;
    private boolean trancamentoSemestre;
    private List<String> disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso, boolean especial){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.especial = especial;
        this.trancamentoSemestre = false;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public boolean podeMatricular(int numDisciplinas){
        if (trancamentoSemestre){
            return false;
        }
        if (especial && numDisciplinas >= 2){
            return false;
        }
        return true;
    }
    public boolean matricular(Disciplina disciplina) {
        if (!podeMatricular() || !disciplina.temVagas()) {
            return false;
        }
        disciplinasMatriculadas.add(new Matricula(disciplina.getCodigo()));
        disciplina.ocuparVaga();
        return true;
    }
    public void trancarSemestre(){
        this.trancamentoSemestre = true;
        this.disciplinasMatriculadas.clear();
    }

        // --- Getters e Setters ---
        public String getMatricula() { return matricula; }
        public String getNome() { return nome; }
        public String getCurso() { return curso; }
        public boolean isEspecial() { return especial; }
        public boolean isTrancamentoSemestre() { return trancamentoSemestre; }
        public List<Matricula> getDisciplinasMatriculadas() { return disciplinasMatriculadas; }  
        public void setNome(String nome) { this.nome = nome; }
        public void setCurso(String curso) { this.curso = curso; }
    }





}
