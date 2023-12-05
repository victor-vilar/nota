package br.com.victor.vilar.sefaz;

import br.com.victor.vilar.sefaz.domain.notafiscal.NotaFiscal;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Random;

public class NotaFiscalXmlCreator {

    private final String fileOutputUrl = "C:\\users\\victor\\desktop\\";
    private final String rootXmlElement= "Nota_Fiscal";
    private final String codigoMunicipioDuqueDeCaxias = "3301702";
    private NotaFiscalXmlBasicConfiguration configuration;

    public void createNotaFiscalXml(){
        //criar documento
        Document document = this.createDocument();
        document.appendChild(document.createElement("TNFe"));


    }

    //cria um novo document DOM, ou pode ser usado para ler um XML existente
    private Document createDocument() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.newDocument();
        }catch(Exception e){
            System.out.println("Não foi possivel criar o document");
        }
        return null;
    }

    //cria o arquivo xml e salva na maquina
    private void buildXmlFile(Document document, String nome){
        try{
            TransformerFactory tf = TransformerFactory.newDefaultInstance();
            Transformer trans = tf.newTransformer();
            DOMSource dom = new DOMSource(document);
            StreamResult streamResult = new StreamResult(
                    new File(this.fileOutputUrl + nome + ".xml" ));
            trans.transform(dom,streamResult);
        }catch(Exception e){
            System.out.println("Deu erro");
        }
    }

    private Element createElement(String name,Document document){
        return document.createElement(name);
    }
    private void appendElement(Element element, Document document){
        document.appendChild(element);
    }
    private void appendChild(Element father, Element child){
        father.appendChild(child);
    }

    private void notaFiscalIdentification(NotaFiscal notaFiscal, Document document){

        //identificação da nota fiscal node
        Element ide = document.createElement("ide");

        //uf node
        Element cUF = document.createElement("cUF");
        cUF.setTextContent("35");
        ide.appendChild(cUF);

        //craindo numero aletatorio
        Element cNF = document.createElement("cNF");
        Random random = new Random();
        int n = 10000000 + random.nextFloat() * 99999999;
        cNF.setTextContent(n);
        ide.appendChild(cNF);

        // natureza de operação
        Element natOp = document.createElement("natOp");
        natOp.setTextContent(notaFiscal.getNaturezaDeOperacao());
        ide.appendChild(natOp);

        //modelo da nota
        Element mod = document.createElement("mod");
        mod.setTextContent(notaFiscal.getModeloNotaFiscal().toString());
        ide.appendChild(mod);

        //serie documento
        Element serie = document.createElement("serie");
        serie.setTextContent(notaFiscal.getSerie().toString());
        ide.appendChild(serie);

        //numero
        Element nNF = document.createElement("nNF");
        nNF.setTextContent(notaFiscal.getNumero());
        ide.appendChild(nNF);

        //data de emissao
        Element dhEmi = document.createElement("dhEmi");
        dhEmi.setTextContent(notaFiscal.getDataHoraEmissao().toString());
        ide.appendChild(dhEmi);

        //data de saida
        Element ddhSaiEnt = document.createElement("ddhSaiEnt");
        ddhSaiEnt.setTextContent(notaFiscal.getDataHoraEmissao().toString());
        ide.appendChild(ddhSaiEnt);

        //tipo documento
        Element tpNF = document.createElement("tpNF");
        tpNF.setTextContent(notaFiscal.getTipo().toString());
        ide.appendChild(tpNF);

        //identificador de local de destino
        Element idDest = document.createElement("idDest");
        idDest.setTextContent(notaFiscal.getIdentificadorDeLocalDeDestino().toString());
        ide.appendChild(idDest);

        //identificador do municipio emissor
        Element cMunFG = document.createElement("cMunFG");
        cMunFG.setTextContent(notaFiscal.getCodigoMunicipio());
        ide.appendChild(cMunFG);

        //formato de impressão
        Element tpImp = document.createElement("tpImp");
        tpImp.setTextContent();
        ide.appendChild(tpImp);

        //forma emissão
        Element tpEmis = document.createElement("tpEmis");
        tpEmis.setTextContent();
        ide.appendChild(tpEmis);

        //digito verificador
        Element cDV = document.createElement("cDV");
        cDV.setTextContent();
        ide.appendChild(cDV);

        //tipo ambiente
        Element tpAmb = document.createElement("tpAmb");
        tpAmb.setTextContent();
        ide.appendChild(tpAmb);

        //finalidade da emissão
        Element finNFe = document.createElement("finNFe");
        finNFe.setTextContent();
        ide.appendChild(finNFe);

        //operação com consumidor final
        Element indFinal = document.createElement("indFinal");
        indFinal.setTextContent();
        ide.appendChild(indFinal);

        //indicador de presença do comprador
        Element indPres = document.createElement("indPres");
        indPres.setTextContent();
        ide.appendChild(indPres);

        //indicador de intermediador
        Element indIntermed = document.createElement("indIntermed");
        indIntermed.setTextContent();
        ide.appendChild(indIntermed);

        //processo de emissão
        Element procEmi = document.createElement("procEmi");
        procEmi.setTextContent();
        ide.appendChild(procEmi);

        //versão do aplicativo utilizado para processo de emissão;
        Element verProc = document.createElement("verProc");
        verProc.setTextContent();
        ide.appendChild(verProc);

        //se o tipo de emissão da nota for diferente de 1(normal).
        if(!tpEmis.getTextContent().equals("1")){

            //data da hora do contigencia
            Element dhCont = document.createElement("dhCont");
            dhCont.setTextContent();
            ide.appendChild(dhCont);

            //justificativa de entrada
            Element xJust = document.createElement("xJust");
            xJust.setTextContent();
            ide.appendChild(xJust);


        }


    };




}
