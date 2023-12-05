package br.com.victor.vilar.sefaz.enums.identificacao.pessoajuridica;

/**
 * Enum utilizado na identificação do destinatario
 * do xml
 * @author Victor Vilar
 * @since 2023-12-02
 *
 */
public enum IndicacaoInscricaoEstadual {

    CONTRIBUINTE_ICMS_PAGAMENTO_A_VISTA(1),
    CONTRIBUIENTE_ISENTO_DE_INSCRICAO(2),
    NAO_CONTRIBUINTE(3);

    private final int codigo;
    IndicacaoInscricaoEstadual(int codigo){
        this.codigo =codigo;
    }
}
