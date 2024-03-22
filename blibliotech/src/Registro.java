public class Registro {
    private Livro livro;
    private String tipoRegistro;
    private String data;

    public Registro(Livro livro, String tipoRegistro, String data) {
        this.livro = livro;
        this.tipoRegistro = tipoRegistro;
        this.data = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
