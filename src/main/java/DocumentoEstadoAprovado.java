public class DocumentoEstadoAprovado extends DocumentoEstado{
    private DocumentoEstadoAprovado() {}
    private static DocumentoEstadoAprovado instance = new DocumentoEstadoAprovado();
    public static DocumentoEstadoAprovado getInstance() { return instance; }

    @Override
    public String getEstado() {
        return "Documento aprovado";
    }
}
