package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum IdentificadorIntermediador {

    //sem intermediador em site ou plataforma propria
    OPERACAO_SEM_INTERMEDIADOR(0),
    //operação em site ou plataforma de terceiros(intermediadores/marketplace)
    OPERACAO_EM_SITE_PLATAFORMA_TERCEIROS(1);

    private final int codigo;
    IdentificadorIntermediador(int codigo){
        this.codigo = codigo;
    }


}
