package aplicacao;

import classes.Empregado;
import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empregado e1 = new Empregado("Hially","Rabelo",1000);
        Empregado e2 = new Empregado("Gustavo","Borges",500);
        
        System.out.println("Salario Anual Empregado 1: "+e1.getSalarioMensal()*12);
        System.out.println("Salario Anual Empregado 2: "+e2.getSalarioMensal()*12);
        
        e1.setSalarioMensal(e1.getSalarioMensal()*1.10);
        e2.setSalarioMensal(e2.getSalarioMensal()*1.10);
        
        System.out.println("Salario Anual com Aumento Empregado 1: "+e1.getSalarioMensal()*12);
        System.out.println("Salario Anual com Aumento Empregado 2: "+e2.getSalarioMensal()*12);
    }
}
