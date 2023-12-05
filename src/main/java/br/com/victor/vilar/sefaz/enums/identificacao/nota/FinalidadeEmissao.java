package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum FinalidadeEmissao {

    NFE_NORMAL(1),
    NFE_COMPLEMENTAR(2),
    NFE_AJUSTE(3),
    DEVOLUCAO_RETORNO(4);

    private final int codigo;
    FinalidadeEmissao(int codigo){
        this.codigo = codigo;
    }

}
