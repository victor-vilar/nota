package br.com.victor.vilar.sefaz.domain.pessoa;

public class PessoaFisica extends Pessoa{

    /**
     * Número do CPF do emitente
     */
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getTipoDocumento() {
        return "CPF";
    }

    @Override
    public String getDocumento() {
        return CPF;
    }
}
