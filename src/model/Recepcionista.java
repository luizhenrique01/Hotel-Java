package model;

import interfaces.interfaceRecepcionista;

public class Recepcionista extends Pessoa implements interfaceRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("[X] - Atender telefone");
    }

    @Override
    public void falarIngles() {
        System.out.println("[X] - Falar ingles");
    }
}
