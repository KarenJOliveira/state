public class DocumentoEstadoReprovado extends DocumentoEstado{
    private DocumentoEstadoReprovado() {}
    private static DocumentoEstadoReprovado instance = new DocumentoEstadoReprovado();
    public static DocumentoEstadoReprovado getInstance() { return instance; }

    @Override
    public String getEstado() {
        return "Documento reprovado";
    }
}
