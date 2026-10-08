public abstract class DocumentoEstado {
    public abstract String getEstado();

    public boolean novo(Documento documento)
    {
        return false;
    }

    public boolean analisar(Documento documento)
    {
        return false;
    }

    public boolean corrigir(Documento documento)
    {
        return false;
    }

    public boolean aprovar(Documento documento)
    {
        return false;
    }

    public boolean reprovar(Documento documento)
    {
        return false;
    }
}
