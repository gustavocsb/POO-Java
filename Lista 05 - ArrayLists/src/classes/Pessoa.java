package classes;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Telefone> telefones;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }
    
    public void delTelefone(Telefone telefone){
        this.telefones.remove(telefone);
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()
                + "\nCPF: "+getCpf()
                + "\nEmail: "+getEmail()
                + "\nTelefone(s): "+getTelefones()
                + "\nEndereco: "+getEndereco();
    }
}
