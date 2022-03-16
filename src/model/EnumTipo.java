package model;

public enum EnumTipo {
    BASICO("Basico"), MASTER("Master"),PRESIDENCIAL("Presidencial");

    private String valor;

    private EnumTipo(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
