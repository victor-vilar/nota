package br.com.victor.vilar.sefaz.domain;


import br.com.victor.vilar.sefaz.enums.identificacao.pessoajuridica.RegimeTributario;

/**
 * classe que representa dados de interesse das prefeituras
 * utilizado principalmente por pessoa juridica.
 * @author Victor Vilar
 * @since 2023-12-02
 * @version 0.1.0
 */
public class InformacoesParaPrefeitura {

    /**
     * Inscrição Municipal
     * min Length = 1
     * max Length = 15
     */
    private String IM;

    /**
     * CNAE Fiscal
     * Não obrigatório
     * value="[0-9]{7}" preservar espaços em branco
     */
    private int CNAE;

    /**
     * Código de Regime Tributário. Este
     * campo será obrigatoriamente preenchido com:
     * 1 – Simples Nacional;
     * 2 – Simples Nacional – excesso de sublimite de receita bruta;
     * 3 – Regime Normal.
     */
    private RegimeTributario codigoRegimeTributario;
}
