public class Arqueiro extends Personagem{
    public Arqueiro(String name) {
        super(name, 8, 3, 3.7,"Esquivar");
    }
    @Override
    public double Special(){
        System.out.println(this.name+" Esquivou! Porém nada aconteceu...");
        return 0;
    }
}
