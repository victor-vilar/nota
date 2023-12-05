package br.com.victor.vilar.sefaz.domain.pessoa;

public class PessoaEstrangeiro extends Pessoa{

    /**
     * Identificador do destinatário, em
     * caso de comprador estrangeiro
     * pattern value="([!-ÿ]{0}|[!-ÿ]{5,20})?"
     */
    private String idEstrangeiro;

    @Override
    public String getTipoDocumento() {
        return "idEstrangeiro";
    }

    @Override
    public String getDocumento() {
        return idEstrangeiro;
    }
}
