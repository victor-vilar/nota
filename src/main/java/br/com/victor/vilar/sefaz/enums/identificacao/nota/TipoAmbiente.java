package br.com.victor.vilar.sefaz.enums.identificacao.nota;

public enum TipoAmbiente {
    PRODUCAO(1),
    HOMOLOGACAO(2);

    private final int type;
    TipoAmbiente(int type){
        this.type = type;
    }

    public int getType(){
        return this.type;
    }
}
