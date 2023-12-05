package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum IdentificadorDeLocalDeDestino {

    INTERNA(1),
    INTERESTADUAL(2),
    EXTERIOR(3);

    private final int codigo;

    IdentificadorDeLocalDeDestino(int codigo){
        this.codigo =codigo;
    }


}
