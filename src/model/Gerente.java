package model;

import interfaces.interfaceCamareira;
import interfaces.interfaceRecepcionista;

public class Gerente extends Pessoa implements interfaceCamareira, interfaceRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarCama() {
        System.out.println("[-] - Arrumar cama ");
    }

    @Override
    public void limparQuarto() {
        System.out.println("[-] - Limpar quarto ");
    }

    @Override
    public void atenderTelefone() {
        System.out.println("[X][X][X] - Arrumar cama ");
    }

    @Override
    public void falarIngles() {
        System.out.println("[X][X][X][X][X] - Arrumar cama ");
    }
}
