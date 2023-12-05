package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum ModeloNotaFiscal {

    NFE(55),
    NFCE(65);

    private final int codigo;

     ModeloNotaFiscal(int codigo){
        this.codigo = codigo;
    }
}
