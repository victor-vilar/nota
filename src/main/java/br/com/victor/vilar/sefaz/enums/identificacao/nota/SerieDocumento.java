package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum SerieDocumento {

    NORMAL("0-889"),
    AVULSO("890-899"),
    SCAN("900-999");

    private final String serie;

    SerieDocumento(String serie){
        this.serie = serie;
    }


}
