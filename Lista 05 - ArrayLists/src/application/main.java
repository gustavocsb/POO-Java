package application;

import java.util.Scanner;
import java.util.ArrayList;
import classes.Aluno;
import classes.Curso;
import classes.Endereco;
import classes.Pessoa;
import classes.Professor;
import classes.Telefone;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Curso curso;
        ArrayList<Curso> cursos;
        
        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();
        
        Telefone telefone;
        ArrayList<Telefone> telefones;
        
        Professor novoProf = new Professor();
        Endereco endereco;
        
        //Telefone t1 = new Telefone("Movel", "061", "992228371");
        //Telefone t2 = new Telefone("Fixo", "061", "36275021");
        //Telefone t3 = new Telefone("Movel", "062", "912391920");
        
        //Curso c1 = new Curso("Engenharia de Software");
        //Curso c2 = new Curso("Ciencia da Computacao");
        //Curso c3 = new Curso("Analise e Desenvolvimento de Sistemas");
        
        
        // ---------------------------------------------------------------------- PROFESSOR ------------------------------------------------------------------------------
        System.out.println("----- Cadastro do Professor -----");
        System.out.println("Digite o nome do professor: ");
        novoProf.setNome(sc.nextLine());
        System.out.println("Digite o email do professor: ");
        novoProf.setEmail(sc.nextLine());
        System.out.println("Digite o CPF do professor: ");
        novoProf.setCpf(sc.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite o Estado: ");
        endereco.setEstado(sc.nextLine());
        novoProf.setEndereco(endereco);
        
        int totalTelefones;
        System.out.println("Numero total de telefones: ");
        totalTelefones = sc.nextInt();
        sc.nextLine();
        telefones = new ArrayList<>();
        for(int i=0;i<totalTelefones;i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone "+(i+1)+": ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone "+(i+1)+": ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero do telefone "+(i+1)+": ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulacao: ");
        novoProf.setTitulacao(sc.nextLine());
        System.out.println("Digite o salario: ");
        novoProf.setSalario(sc.nextDouble());
        sc.nextLine();
        
        cursos = new ArrayList<>();
        int totalCursos;
        System.out.println("Numero total de cursos: ");
        totalCursos = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<totalCursos;i++){
            curso = new Curso();
            System.out.println("Digite o nome do curso "+(i+1)+": ");
            curso.setNome(sc.nextLine());
            cursos.add(curso);
        }
        novoProf.setCurso(cursos);
        
        // ---------------------------------------------------------------------- ALUNO ------------------------------------------------------------------------------
        System.out.println("----- Cadastro do aluno-----");
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite o email do aluno: ");
        aluno.setEmail(sc.nextLine());
        System.out.println("Digite o CPF do aluno: ");
        aluno.setCpf(sc.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite o Estado: ");
        endereco.setEstado(sc.nextLine());
        aluno.setEndereco(endereco);
        
        System.out.println("Numero total de telefones: ");
        totalTelefones = sc.nextInt();
        sc.nextLine();
        telefones = new ArrayList<>();
        for(int i=0;i<totalTelefones;i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone "+(i+1)+": ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone "+(i+1)+": ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero do telefone "+(i+1)+": ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        aluno.setTelefones(telefones);
        
        curso = new Curso();
        System.out.println("Digite o curso do aluno: ");
        curso.setNome(sc.nextLine());
        aluno.setCurso(curso);
        
        int totalNotas;
        System.out.println("Numero total de notas: ");
        totalNotas = sc.nextInt();
        sc.nextLine();
        notas = new ArrayList<>();
        for(int i=0;i<totalNotas;i++){
            System.out.println("Digite a nota "+(i+1)+": ");
            notas.add(sc.nextDouble());
        }
        aluno.setNotas(notas);
        
        // ---------------------------------------------------------------------- IMPRESSÃO ------------------------------------------------------------------------------
        novoProf.imprimir();
        aluno.imprimir();
    }
}
