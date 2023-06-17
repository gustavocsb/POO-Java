package classes;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private ArrayList<Curso> curso;
    //private int totalTelefones;
    
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
    
    /*public void setTotalTelefones(int totalTelefones) {
        this.totalTelefones = totalTelefones;
    }
    
    public int getTotalTelefones() {
        return totalTelefones;
    }*/
    
    @Override
    public void imprimir(){
        System.out.println("----- Dados do Professor -----");
        super.imprimir();
        System.out.println("\nTitulacao: "+getTitulacao()
                + "\nSalario: R$"+getSalario());
        for(int i=0;i<getCurso().size();i++){
            getCurso().get(i).imprimirCurso();
        }
    }
}
