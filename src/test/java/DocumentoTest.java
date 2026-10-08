import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentoTest {
    Documento documento;

    @BeforeEach
    void setUp()
    {
        documento = new Documento();
    }

    @Test
    void deveRetornarEstadoInicialNovo()
    {
        DocumentoEstado documentoEstado = documento.getEstado();
        assertEquals(DocumentoEstadoNovo.getInstance(),documentoEstado);
    }

    @Test
    void naoDeveRetornarNovoParaNovoDocumento()
    {
        assertFalse(documento.novo());
    }

    @Test
    void naoDeveCorrigirDocumentoNovo()
    {
        assertFalse(documento.corrigir());
    }

    @Test
    void naoDeveAprovarDocumentoNovo()
    {
        assertFalse(documento.aprovar());
    }

    @Test
    void naoDeveReprovarDocumentoNovo()
    {
        assertFalse(documento.reprovar());
    }

    @Test
    void deveAnalisarNovoDocumento()
    {
        assertTrue(documento.analisar());
        assertEquals(DocumentoEstadoEmAnalise.getInstance(),documento.getEstado());
    }

    @Test
    void naoDeveAnalisarDocumentoEmAnalise()
    {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        assertFalse(documento.analisar());
    }

    @Test
    void deveAprovarDocumentoEmAnalise()
    {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        assertTrue(documento.aprovar());
        assertEquals(DocumentoEstadoAprovado.getInstance(),documento.getEstado());
    }

    @Test
    void deveReprovarDocumentoEmAnalise()
    {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        assertTrue(documento.reprovar());
        assertEquals(DocumentoEstadoReprovado.getInstance(),documento.getEstado());
    }

    @Test
    void deveCorrigirDocumentoEmAnalise()
    {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        assertTrue(documento.corrigir());
        assertEquals(DocumentoEstadoCorrigido.getInstance(),documento.getEstado());
    }

    @Test
    void naoDeveCorrigirDocumentoCorrigido()
    {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        assertFalse(documento.corrigir());
    }

    @Test
    void naoDeveRetornarNovoDocumentoCorrigido()
    {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        assertFalse(documento.novo());
    }

    @Test
    void naoDeveAprovarDocumentoCorrigido()
    {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    void naoDeveReprovarDocumentoCorrigido()
    {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        assertFalse(documento.reprovar());
    }

    @Test
    void deveAnalisarDocumentoCorrigido()
    {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        assertTrue(documento.analisar());
    }

    @Test
    void naoDeveReprovarDocumentoReprovado()
    {
        documento.setEstado(DocumentoEstadoReprovado.getInstance());
        assertFalse(documento.reprovar());
    }

    @Test
    void naoDeveRetornarNovoDocumentoReprovado()
    {
        documento.setEstado(DocumentoEstadoReprovado.getInstance());
        assertFalse(documento.novo());
    }

    @Test
    void naoDeveAprovarDocumentoReprovado()
    {
        documento.setEstado(DocumentoEstadoReprovado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    void naoDeveCorrigirDocumentoReprovado()
    {
        documento.setEstado(DocumentoEstadoReprovado.getInstance());
        assertFalse(documento.corrigir());
    }

    @Test
    void naoDeveAprovarDocumentoAprovado()
    {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    void naoDeveRetornarNovoDocumentoAprovado()
    {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.novo());
    }

    @Test
    void naoDeveCorrigirDocumentoAprovado()
    {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.corrigir());
    }

    @Test
    void naoDeveReprovarDocumentoAprovado()
    {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.reprovar());
    }

}
