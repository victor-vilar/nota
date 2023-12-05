package br.com.victor.vilar.sefaz.domain.pessoa;

public class PessoaJuridica extends Pessoa {

    /**
     * Número do CNPJ do emitente
     */
    private String CNPJ;

    /**
     * Nome fantasia
     */
    private String xFant;



    /**
     * Inscricao Estadual do Substituto
     * Tributário
     * Não obrigatorio.
     */
    private String IEST;

    /**
     * Inscrição na SUFRAMA (Obrigatório nas
     * operações com as áreas com benefícios de incentivos
     * fiscais sob controle da SUFRAMA) PL_005d - 11/08/09
     * - alterado para aceitar 8 ou 9 dígitos
     * value="[0-9]{8,9}"
     */
    private String ISUF;

    /**
     * Inscrição Municipal do tomador do
     * serviço
     * minLength = 1
     * max_length = 15
     */
    private String IM;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIEST() {
        return IEST;
    }

    public void setIEST(String IEST) {
        this.IEST = IEST;
    }

    @Override
    public String getTipoDocumento() {
        return "CNPJ";
    }

    @Override
    public String getDocumento() {
        return CNPJ;
    }
}

