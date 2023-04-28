package aplicacao;

import classes.cliente;
import classes.empregado;
import classes.gerente;
import classes.pessoa;
import classes.vendedor;

public class main {
    public static void main(String[] args) {
        
        gerente g = new gerente("Marcelo",31,"Masculino",5500.49,"GR8941","CDS");
        vendedor v = new vendedor("Hially",25,"Feminino",2400.00,"VR1750",9500.59,63);
        cliente c = new cliente("Gustavo",20,"Masculino",49.99,2003);
        
        System.out.println(g.toString()+v.toString()+c.toString());
    }
}
