package model;

public class Cliente extends Pessoa {

    private int idade;

    public Cliente(String nome, String telefone, String cpf,int idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
