public class Product {
    public int id;
    public String name;
    public Double weight;
    public Double price;
    public Boolean discount;

    public void addToCart() {
        System.out.println("Produto adicionado ao carrinho");
    }
    public Double calcDiscount(){
        if(this.discount == Boolean.TRUE){
            this.price = this.price - 25.05;
        }
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}