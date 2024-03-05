public class Mago extends Personagem{

    public Mago(String name) {
        super(name, 8, 3, 3.7,"Magia");
    }

    //(Magia) buff de ataque +3
    @Override
    public double Special(){
        System.out.println(this.name+" Lançou Ataque Magico!");
        return this.attack()+1.6;
    }
}
