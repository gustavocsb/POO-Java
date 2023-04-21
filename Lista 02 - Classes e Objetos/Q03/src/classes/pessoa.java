package classes;

public class pessoa {
    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;

    //ajustaDataDeNascimento
    public pessoa(int diaNasc, int mesNasc, int anoNasc, String nome) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
    }    
    
    //método para calcular idade introduzindo a data que você quer calcular, não necessariamente precisa ser a data de hoje
    public void calculaIdade(int diaCalc, int mesCalc, int anoCalc){
        idade = anoCalc - anoNasc;
        /*
            reduzindo a idade de acordo com o mês/dia introduzido no método:
            1. se o mês introduzido for menor que ao mês do nascimento, -1 ano
            2. se o mês introduzido for igual ao mês do nascimento e o dia introduzido for menor que o dia do nascimento, -1 ano
        */
        if(mesCalc < mesNasc || (mesCalc == mesNasc && diaCalc < diaNasc)){
            idade--;
        }
    }
    
    public int informaIdade(){
        return idade;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome
                + "\nData de Nascimento: "+diaNasc
                + "/"+mesNasc
                + "/"+anoNasc
                + "\nIdade: "+idade;
    }
}
