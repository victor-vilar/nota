package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum FormatoImpressaoDanfe {

    SEM_DANFE(0),
    DANFE_RETRATO(1),
    DANFE_PAISSAGEM(2),
    DANFE_SIMPLIFICADO(3),
    DANFE_NFCE(4),
    DANFE_NFCE_MESSAGEM_ELETRONICA(5);

    private final int codigo;

    FormatoImpressaoDanfe(int codigo){
        this.codigo =codigo;
    }

}
