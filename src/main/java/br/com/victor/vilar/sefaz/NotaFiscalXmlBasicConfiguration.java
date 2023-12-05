package br.com.victor.vilar.sefaz;

import br.com.victor.vilar.sefaz.enums.identificacao.nota.TipoAmbiente;

/**
 * classe utilizada para configurar o xml que sera criado, com as informações que todo o tipo de xml
 * ira precisar para que o sistema reconheça
 *
 */
public class NotaFiscalXmlBasicConfiguration {

    //tipo de ambiente
    public TipoAmbiente tpAmb;

    //serviço solictado
    public String serviceSolicitationType;

}
