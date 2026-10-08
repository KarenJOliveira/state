public class DocumentoEstadoCorrigido extends DocumentoEstado{
    private DocumentoEstadoCorrigido() {}
    private static DocumentoEstadoCorrigido instance = new DocumentoEstadoCorrigido();
    public static DocumentoEstadoCorrigido getInstance() { return instance; }

    @Override
    public String getEstado() {
        return "Documento corrigido";
    }

    @Override
    public boolean analisar(Documento documento) {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        return true;
    }
}
