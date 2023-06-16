package classes;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double> notas;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void addNotas(Double nota){
        this.notas.add(nota);
    }
    
    public void delNotas(Double nota){
        this.notas.remove(nota);
    }
    
    public double calcularMedia(){
        double soma = 0;
        for (Double nota : notas){
            soma+=nota;
        }
        
        return soma/notas.size();
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\n"+getCurso()
                + "\nNotas: "+getNotas();
    }
}
