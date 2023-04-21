package classes;

public class fatura {
    private String numero;
    private String desc;
    private int qtdItem;
    private double precoItem;
    
    public fatura(double precoItem){
        if(precoItem < 0){
            this.precoItem = 0;
        }else{
            this.precoItem = precoItem;
        }
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if(precoItem < 0){
            this.precoItem = 0;
        }else{
            this.precoItem = precoItem;
        }
    }
    
    public double getTotalFatura (){
        double totalFatura = qtdItem*precoItem;
        if(totalFatura < 0){
            totalFatura = 0;
        }return totalFatura;
    }
}
