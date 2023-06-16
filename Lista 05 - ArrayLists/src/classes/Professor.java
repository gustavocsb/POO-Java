package classes;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private ArrayList<Curso> curso;
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }
    
    public void addCurso(Curso curso){
        this.curso.add(curso);
    }
    
    public void delCurso(Curso curso){
        this.curso.remove(curso);
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nTitulacao: "+getTitulacao()
                + "\nSalario: "+getSalario()
                + "\nCursos:\n"+getCurso();
    }
}
