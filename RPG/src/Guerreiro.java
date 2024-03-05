public class Guerreiro extends Personagem{

    public Guerreiro(String name) {
        super(name, 10, 2.5, 3.7,"Pular");
    }

    //(Pulo) da um pulo kkkkkk

    @Override
    public double Special(){
        System.out.println(this.name+" Pulou!");
        return 0;
    }
    @Override
    public void cura(){
        this.healthPoints = 10;
    }
}

