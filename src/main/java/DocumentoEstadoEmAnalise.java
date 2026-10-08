public class DocumentoEstadoEmAnalise extends DocumentoEstado{
    private DocumentoEstadoEmAnalise() {}
    private static DocumentoEstadoEmAnalise instance = new DocumentoEstadoEmAnalise();
    public static DocumentoEstadoEmAnalise getInstance() { return instance; }

    @Override
    public String getEstado() {
        return "Documento em análise";
    }

    @Override
    public boolean aprovar(Documento documento) {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        return true;
    }

    @Override
    public boolean reprovar(Documento documento) {
        documento.setEstado(DocumentoEstadoReprovado.getInstance());
        return true;
    }

    @Override
    public boolean corrigir(Documento documento) {
        documento.setEstado(DocumentoEstadoCorrigido.getInstance());
        return true;
    }
}
