public class Arqueiro extends Personagem{
    public Arqueiro(String name) {
        super(name, 8, 3, 3.7);
    }
    public void rool(){
        System.out.println(this.name+" Esquivou!");
    }
}
