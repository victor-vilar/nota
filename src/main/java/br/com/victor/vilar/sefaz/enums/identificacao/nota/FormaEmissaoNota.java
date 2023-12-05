package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum FormaEmissaoNota {

    NORMAL(1),
    CONTINGENCIA_FS(2),
    REGIME_ESPECIAL_NFF(3),
    CONTINGENCIA_DPEC(4),
    CONTINGENCIA_FSDA(5),
    CONTINGENCIA_SVC_AN(6),
    CONTINGENCIA_SVC_RS(7),
    CONTINGENCIA_OFFLINE_NFCE(9);

    private final int codigo;

    FormaEmissaoNota(int codigo){
        this.codigo = codigo;
    }


}
