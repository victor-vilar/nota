package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum TipoDocumento {

    ENTRADA(0),
    SAIDA(1);

    private final int tipo;
    TipoDocumento(int tipo){
        this.tipo =tipo;
    }
}
