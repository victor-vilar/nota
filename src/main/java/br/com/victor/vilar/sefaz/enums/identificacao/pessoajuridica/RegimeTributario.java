package br.com.victor.vilar.sefaz.enums.identificacao.pessoajuridica;

/**
 * codigo regime tributário utilizado pela classe
 * {@link br.com.victor.vilar.sefaz.domain.InformacoesParaPrefeitura}
 */
public enum RegimeTributario {

    SIMPLES_NACIONAL(1),
    SIMPLES_NACIONAL_EXCESSO_SUBLIMITE_DE_RECEITA_BRUTA(2),
    REGIME_NORMAL(3);

    private int codigo;

    RegimeTributario(int codigo){
        this.codigo = codigo;
    }
}
