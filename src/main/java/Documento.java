public class Documento {
    private DocumentoEstado estado;

    public Documento()
    {
        this.estado = DocumentoEstadoNovo.getInstance();
    }

    public DocumentoEstado getEstado()
    {
        return estado;
    }

    public void setEstado(DocumentoEstado estado)
    {
        this.estado = estado;
    }

    public boolean novo()
    {
        return estado.novo(this);
    }

    public boolean analisar()
    {
        return estado.analisar(this);
    }

    public boolean corrigir()
    {
        return estado.corrigir(this);
    }

    public boolean aprovar()
    {
        return estado.aprovar(this);
    }

    public boolean reprovar()
    {
        return estado.reprovar(this);
    }
}
