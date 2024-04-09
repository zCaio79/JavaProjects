public class Carro {
    private String id_carro;
    private String marca;
    private boolean disponivel;


    public Carro(String id_carro, String marca) {
        this.id_carro = id_carro;
        this.marca = marca;
        this.disponivel = true;
    }

    public String getId_carro() {
        return id_carro;
    }

    public void setId_carro(String id_carro) {
        this.id_carro = id_carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
