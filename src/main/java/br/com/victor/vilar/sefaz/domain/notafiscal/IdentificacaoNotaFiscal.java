package br.com.victor.vilar.sefaz.domain.notafiscal;

import br.com.victor.vilar.sefaz.enums.identificacao.nota.*;
import br.com.victor.vilar.sefaz.enums.identificao.nota.*;

import java.time.LocalDateTime;

/**
 * Representação dos campos que identificam a nota fiscal
 * @author Victor Vilar
 * @since 2023-12-01
 * @version 0.1.0
 */
public class IdentificacaoNotaFiscal {

    //UF do emitente da nota fiscal
    private String cUf;

    /**
     * Código numérico que compõe a Chave de
     * Acesso. Número aleatório gerado pelo emitente para
     * cada NF-e.
     * value="[0-9]{8}"
     *
     */
    private String cNF;

    /**
     * Descrição da Natureza da Operação
     */
    private String natOp;

    /**
     * Código do modelo do Documento Fiscal.
     * -55 = NF-e
     * -65 = NFC-e.
     */
    private ModeloNotaFiscal mod;

    /**
     * Série do Documento Fiscal série normal
     * 0-889 Avulsa Fisco 890-899 SCAN 900-999
     */
    private SerieDocumento serie;

    /**
     * Número do Documento Fiscal
     */
    private String nNF;

    /**
     * Data e Hora de emissão do Documento
     * Fiscal (AAAA-MM-DDThh:mm:ssTZD) ex.:
     * 2012-09-01T13:00:00-03:00
     */
    private LocalDateTime dhEmi;

    /**
     * Data e Hora da saída ou de entrada da
     * mercadoria / produto (AAAA-MM-DDTHH:mm:ssTZD)
     */
    private LocalDateTime ddhSaiEnt;

    /**
     * Tipo do Documento Fiscal:
     * 0 - entrada
     * 1 - saída
     */
    private TipoDocumento tpNF;

    /**
     * Identificador de Local de destino da
     * operação:
     * 1-Interna
     * 2-Interestadual
     * 3-Exterior
     */
    private IdentificadorDeLocalDeDestino idDest;

    /**
     * Código do Município de Ocorrência do
     * Fato Gerador (utilizar a tabela do IBGE)
     */
    private String cMunFg;

    /**
     * Formato de impressão do DANFE:
     * 0-sem DANFE
     * 1-DANFe Retrato
     * 2-DANFe Paisagem
     * 3-DANFe Simplificado
     * 4-DANFe NFC-e
     * 5-DANFe NFC-e em mensagem eletrônica
     */
    private FormatoImpressaoDanfe tpImp;

    /**
     * Forma de emissão da NF-e:
     * 1 - Normal
     * 2 - Contingência FS
     * 3 - Regime Especial NFF (NT 2021.002)
     * 4 - Contingência DPEC
     * 5 - Contingência FSDA
     * 6 - Contingência SVC - AN
     * 7 - Contingência SVC - RS
     * 9 - Contingência off-line NFC-e
     */
    private FormaEmissaoNota tpEmis;


    /**
     * Digito Verificador da Chave de Acesso
     * da NF-e -
     * value="[0-9]{1}"
     * Verificar manual da sefaz para ver como é gerado esse digito.
     */
    private String cDV;

    /**
     * Identificação do Ambiente:
     * 1 - Produção
     * 2 - Homologação
     */
    private TipoAmbiente tpAmb;

    /**
     * Finalidade da emissão da NF-e:
     * 1 - NFe normal
     * 2 - NFe complementar
     * 3 - NFe de ajuste
     * 4 - Devolução/Retorno
     */
    private FinalidadeEmissao finNFe;

    /**
     * Indica operação com consumidor final:
     * 0-Não
     * 1-Consumidor Final
     */
    private OperacaoConsumidorFinal indFinal;

    /**
     * Indicador de presença do comprador no
     * estabelecimento comercial no momento da oepração:
     * 0-Não se aplica (ex.: Nota Fiscal complementar ou
     * de ajuste)
     * 1-Operação presencial;
     * 2-Não presencial (ex:internet);
     * 3-Não presencial (ex: teleatendimento)
     * 4-NFC-e entrega em domicílio;
     * 5-Operação presencial, fora do estabelecimento;
     * 9-Não presencial, outros
     */
    private IndicadorPresencaComprador indPres;

    /**
     * Indicador de intermediador/marketplace:
     * 0-Operação sem intermediador (em site ou plataforma
     * própria)
     * 1-Operação em site ou plataforma de
     * terceiros (intermediadores/marketplace)
     */
    private IdentificadorIntermediador indIntermed;

    /**
     * Processo de emissão utilizado com a
     * seguinte codificação:
     * 0 - emissão de NF-e com aplicativo do contribuinte;
     * 1 - emissão de NF-e avulsa pelo Fisco;
     * 2 - emissão de NF-e avulsa, pelo
     * contribuinte com seu certificado digital, através do
     * site do Fisco;
     * 3- emissão de NF-e pelo contribuinte
     * com aplicativo fornecido pelo Fisco.
     */
    private ProcessoEmissao procEmi;


    /**
     * versão do aplicativo utilizado no
     * processo de emissão
     * length = min 1 max 20 char ;
     */
    private String verProc;

    /**
     * Informar a data e hora de entrada
     * em contingência contingência no formato
     * (AAAA-MM-DDThh:mm:ssTZD) ex.:
     * 2012-09-01T13:00:00-03:00.
     */
    private LocalDateTime dhCont;

    /**
     * Informar a Justificativa da
     * entrada
     * length = min 15 max 256 char ;
     */
    private String xJust;


}
