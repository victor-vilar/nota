package br.com.victor.vilar.sefaz.domain.notafiscal;

import br.com.victor.vilar.sefaz.domain.pessoa.Pessoa;

import java.util.List;

/**
 * Representação da nota fiscal
 * @author Victor Vilar
 * @since 2023-12-01
 * @version 0.1.0
 */
public class NotaFiscal {

    /**
     * Identificação da nota fiscal com informações
     * necessária para criar o xml e enviar para o sefaz
     */
    private IdentificacaoNotaFiscal identificacaoNotaFiscal;

    /**
     * Campo não obrigatorio para informar a nota refenreciada a nota atual;
     * linha xml =
    //TODO
    private NotaReferenciada NFref;

    /**
     * Pessoa Física ou Jurídica que emitiu essa nota fiscal.
     */
    private Pessoa emit;

    /**
     * Emissão de avulsa, informar os dados do Fisco
     * emitente
     * Linha xml = 665
     * TODO
     */
    private String avulsa;

    /**
     * Pessoa Física ou Jurídica que recebeu os produtos ou serviços
     * descritos nessa nota fiscal.
     */
    private Pessoa dest;

    /**
     * Identificação do Local de Retirada (informar
     * apenas quando for diferente do endereço do remetente).
     */
    private String retirada;

    /**
     * Identificação do Local de Entrega (informar apenas
     * quando for diferente do endereço do destinatário).
     */
    private String entrega;

    /**
     * Pessoas autorizadas para o download do XML da NF-e.
     */
    private List<Pessoa> autXML;



    private DadosDetalheNotaFiscal dadosNotaFiscal;



}
