package aplicacao;

import classes.Pessoa;
import classes.Fornecedor;
import classes.Empregado;
import classes.Admin;
import classes.Operario;
import classes.Vendedor;        

public class main {
    public static void main(String[] args) {
        
        Fornecedor f1 = new Fornecedor ("Brasal","Taguatinga - DF","(61)99722-2843",8253.00,2842.00);
        Empregado e1 = new Empregado ("Gustavo","Valparaiso","(61)99222-8371",254,1400,10);
        Admin a1 = new Admin ("Hially","Brasilia","(62)59238-4239",915,9500.58,15,150);
        Operario o1 = new Operario ("Gabriel","Ceilandia","(11)27481-4184",254,2500,15,500,50);
        Vendedor v1 = new Vendedor ("Jao","Pindamongangashava","(12)58272-5283",661,3000,12,10000,10);
        
        System.out.println(f1.toString());
        System.out.println(e1.toString());
        System.out.println(a1.toString());
        System.out.println(o1.toString());
        System.out.println(v1.toString());
    }
}
