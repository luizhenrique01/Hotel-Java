package model;

import interfaces.interfaceCamareira;

public class Camareira extends Pessoa implements interfaceCamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarCama() {
        System.out.println("[X] - Arrumar cama ");
    }

    @Override
    public void limparQuarto() {
        System.out.println("[X] - Limpar quarto");
    }
}
