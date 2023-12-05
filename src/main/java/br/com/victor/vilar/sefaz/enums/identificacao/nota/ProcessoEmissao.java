package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum ProcessoEmissao {

    //emissao de nfe com aplicativo do contribuinte
    EMISSAO_APLICATIVO_CONTRIBUINTE(0),
    //emissão de nfe avulsa pelo fisco
    EMISSAO_AVULSA_PELO_FISCO(1),
    //emissao de nfe avulsa, pelo contribuinte com seu certificado digital, atraves do site
    EMISSAO_AVULSA_CONTRIBUINTE_COM_CERTIFICADO_DIGITAL_PELO_SITE_DO_FISCO(2),
    //emissao de nfe pelo contribuinte com app fornecido pelo fisco
    EMISSAO_CONTRIBUINTE_COM_APP_FORNECIDO_PELO_SITE_DO_FISCO(3);

    private final int codigo;
    ProcessoEmissao(int codigo){
        this.codigo = codigo;
    }
}
