public class Cart {

    public Double fullPrice;
    public Double tax;

    public Double showFullPrice(){
        this.fullPrice = this.fullPrice + this.tax;
        return this.fullPrice;
    }
    public void finishBuy(){

    }
}
