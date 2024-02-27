public class Mago extends Personagem{

    public Mago(String name) {
        super(name, 8, 3, 3.7);
    }

    //(Magia) buff de ataque +3
    public double magicAttack(){
        System.out.println(this.name+" Lançou Ataque Magico!");
        return this.attack()+3;
    }
}
