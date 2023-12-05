package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum IndicadorPresencaComprador {

    NAO_SE_APLICA(0),
    OPERACAO_PRESENCIAL(1),
    NAO_PRESENCIAL_INTERNET(2),
    NAO_PRESENCIAL_TELEATENDIMENTO(3),
    NFCE_ENTREGA_DOMICILIO(4),
    OPERACAO_PRESENCIAL_FORA_ESTABELECIMENTO(5),
    NAO_PRESENCIAL_OUTROS(9);

    private final int codigo;

    IndicadorPresencaComprador(int codigo){
        this.codigo = codigo;
    }

}
