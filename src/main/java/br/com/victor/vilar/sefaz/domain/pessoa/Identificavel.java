package br.com.victor.vilar.sefaz.domain.pessoa;

/**
 * interface para pegar o documento de identificação
 * o seu documento.
 * @author Victor Vilar
 * @since 2023-12-02
 * @version 0.1.0
 */
public interface Identificavel {

    String getTipoDocumento();
    String getDocumento();
}
