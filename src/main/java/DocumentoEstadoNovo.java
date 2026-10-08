public class DocumentoEstadoNovo extends DocumentoEstado{
    private DocumentoEstadoNovo() {}
    private static DocumentoEstadoNovo instance = new DocumentoEstadoNovo();
    public static DocumentoEstadoNovo getInstance() { return instance; }

    @Override
    public String getEstado() {
        return "Novo documento";
    }

    @Override
    public boolean analisar(Documento documento) {
        documento.setEstado(DocumentoEstadoEmAnalise.getInstance());
        return true;
    }
}
