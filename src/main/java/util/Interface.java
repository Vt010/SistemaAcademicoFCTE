package main.java.util;

import java.util.Scanner;


public class Interface {
    private Scanner sc = new Scanner(System.in);

    public void iniciarSistema(){
        boolean exec = true;
        
        while (exec){
            System.out.println("\n=== SISTEMA ACADÊMICO FCTE ===");
            System.out.println("1. Modo Aluno (Normal e Especial)");
            System.out.println("2. Modo Disciplina/Turma");
            System.out.println("3. Modo Avaliação/Frequência");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");  
            
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    modoAluno();
                    break;
                case 2:
                    modoDisciplinaTurma();
                    break;
                case 3:
                    modoAvaliacaoFrequencia();
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        System.out.println("Sistema encerrado.");
    }
    
    private void modoAluno() {
        boolean voltar = false;

        while(!voltar){
            System.out.println("\n=== MODO ALUNO ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Editar Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Matricular em disciplina");
            System.out.println("5. Tracamentro de Matrícula");
            System.out.println("6. Verificar Disciplinas matriculadas");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6: 
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        
        }
        private void cadastrarAluno() {
            System.out.println("\n--- CADASTRO DE ALUNO ---");
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Curso: ");
            String curso = sc.nextLine();
            
            System.out.print("É aluno especial? (S/N): ");
            boolean especial = sc.nextLine().equalsIgnoreCase("S");
            
            if (alunoCtrl.cadastrarAluno(matricula, nome, curso, especial)) {
                System.out.println("Aluno cadastrado com sucesso!");
            } else {
                System.out.println("Erro: Matrícula já existe!");
            }
        }





    }
    
        private void modoDisciplinaTurma() {
        // Implementar menu de disciplina/turma
    }
    
        private void modoAvaliacaoFrequencia() {
        // Implementar menu de avaliação/frequência
    }
        }
    
