package br.com.victor.vilar.sefaz.domain.produto;

import br.com.victor.vilar.sefaz.domain.pessoa.Pessoa;

import java.math.BigDecimal;

/**
 *  classe utilizada para identificar o produto ou serviço
 */
public class Item {

    /**Código do produto ou
     serviço. Preencher com CFOP caso se
     trate de itens não relacionados com
     mercadorias/produto e que o contribuinte
     não possua codificação própria Formato
     ”CFOP9999”.
     * minLength = 1;
     * maxLength = 60;
     */
    private String cprod;

    /**GTIN (Global Trade Item
     Number) do produto, antigo código EAN ou
     código de barras
     pattern value="SEM GTIN|[0-9]{0}|[0-9]{8}|[0-9]{12,14}" />
     */
    private String cEAN;

    /**Codigo de barras diferente
     do padrão GTIN
     */
    private String cBarra;

    /**
     * Descrição do produto ou serviço
     * minLength = 1;
     * maxLength = 120
     */
    private String xProd;

    /**Código NCM (8 posições),
     será permitida a informação do gênero
     (posição do capítulo do NCM) quando a
     operação não for de comércio exterior
     (importação/exportação) ou o produto não
     seja tributado pelo IPI. Em caso de item
     de serviço ou item que não tenham
     produto (Ex. transferência de crédito,
     crédito do ativo imobilizado, etc.),
     informar o código 00 (zeros) (v2.0)
     * pattern value="[0-9]{2}|[0-9]{8}"
     */
    private String NCM;


    /**Nomenclatura de Valor
     aduaneio e Estatístico
     */
    private String[] NVE = new String[8];

    /**Codigo especificador
     da Substituicao Tributaria - CEST, que
     identifica a mercadoria sujeita aos
     regimes de substituicao tributária e
     de antecipação do recolhimento do
     imposto
     pattern value="[0-9]{7}
     */
    private String CEST;

    /**
     * Não sei que caralha é essa
     * é um enum de  'S' ou 'N'
     */
    private String indEscala;


    /**CNPJ do Fabricante da
     Mercadoria, obrigatório para produto
     em escala NÃO relevante.
     */
    private Pessoa CNPJFab;

    /**
     * :patter value="([!-ÿ]{8}|[!-ÿ]{10}|SEM CBENEF)?
     */
    private String cBenef;

    /**Código EX TIPI (3 posições)
     pattern value="[0-9]{2,3}"
     */
    private String EXTIPI;

    /**
     * Não tem informação do que seja isso.
     * value="[1,2,3,5,6,7]{1}[0-9]{3}"
     */
    private String CFOP;

    /**
     * Unidade comercial
     * minLength value="1"
     * maxLength value="6"
     */
    private String uCom;

    /**
     * Quantidade Comercial do
     * produto, alterado para aceitar de 0 a 4
     * casas decimais e 11 inteiros.
     * type="TDec_1104v"
     */
    private Long qCom;

    /**
     * Valor unitário de
     * comercialização - alterado para aceitar
     * 0 a 10 casas decimais e 11 inteiros
     * type = "TDec_1110v"
     */
    private Long vUnCom;

    /**Valor bruto do produto ou
     * serviço
     * type="TDec_1302"
     */
    private Long vProd;

    /**GTIN (Global Trade Item
     Number) da unidade tributável, antigo
     código EAN ou código de barras
     private
     value="SEM GTIN|[0-9]{0}|[0-9]{8}|[0-9]{12,14}"
     */
    private String cEANTrib;

    /**
     *  Código de barras da
     *  unidade tributável diferente do padrão
     *  GTIN
     */
    private String CBarraTrib;

    /**
     * Unidade Tributável
     * minLength value="1"
     * maxLength value="6
     */
    private String uTrib;

    /**
     * Quantidade Tributável -
        alterado para aceitar de 0 a 4 casas
        decimais e 11 inteiros
     *  type="TDec_1104v
     */
    private Long qTrib;

    /**
     * Valor unitário de
     tributação - - alterado para aceitar 0 a
     10 casas decimais e 11 inteiros
     * type="TDec_1110v"
     */
    private Long vUnTrib;

    /**
     * Valor Total do Frete
     * type="TDec_1302Opc"
     */
    private BigDecimal vFrete;


    /**
     * Valor Total do Seguro
     * type="TDec_1302Opc"
     */
    private BigDecimal vSeg;

    /**
     * Valor do Desconto
     * type="TDec_1302Opc"
     */
    private BigDecimal vDesc;

    /**
     * Outras despesas acessórias
     * type="TDec_1302Opc"
     */
    private BigDecimal vOutro;

    /**
     * Este campo deverá ser
        preenchido com: 0 – o valor do item
        (vProd) não compõe o valor total da NF-e
        (vProd) 1 – o valor do item (vProd)
        compõe o valor total da NF-e (vProd)
     *
     */
    private int indTot;

    /**
     * Delcaração de Importação
     * Linha = 1194
     * max Occurs = 100
     */
    private List<DeclaracaoImportacao> DI;
    private List<DetalhesExportacao> detExport;
    private List<Rastro> rastroList;
    private DadosDetalheItem infProdNFF;


}
