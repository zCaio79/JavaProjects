public class Guerreiro extends Personagem{

    public Guerreiro(String name) {
        super(name, 10, 2.5, 3.7);
    }

    //(Pulo) da um pulo kkkkkk
    public void jump(){
        System.out.println(this.name+" Pulou!");
    }
}

