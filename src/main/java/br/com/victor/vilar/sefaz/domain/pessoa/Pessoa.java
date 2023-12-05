package br.com.victor.vilar.sefaz.domain.pessoa;

import br.com.victor.vilar.sefaz.enums.identificacao.pessoajuridica.IndicacaoInscricaoEstadual;

/**
 * Classe para representar uma pessoa no caso, pessoa Física ou Jurídica.
 * Essa classe não pode ser instanciada somente uma de suas filhas
 * @author Victor Vilar
 * @since 2023-12-02
 * @version 0.1.0
 */
public abstract class Pessoa implements Identificavel {

    /**
     * Razão Social ou Nome do emitente
     * minLength = 2
     * maxLength = 60
     */
    private String xNome;

    /**
     * Endereço
     */
    private String ender;

    /**
     * Indicador da IE do destinatário:
     * 1 – Contribuinte ICMS pagamento à vista;
     * 2 – Contribuinte isento de inscrição;
     * 9 – Não Contribuinte
     */
    private IndicacaoInscricaoEstadual indIE;

    /**
     * Inscrição Estadual
     */
    private String IE;

    /**
     * Informar o e-mail do destinatário. O
     * campo pode ser utilizado para informar o e-mail de
     * recepção da NF-e indicada pelo destinatário
     *
     */
    private String email;

}
