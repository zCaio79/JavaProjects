public class Monstro extends Entidade{

    //(Construtor)
    public Monstro(String name, double healthPoints, double damagePoints, double shield){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
        this.shield = shield;
    }
    //(Ataque) Retorna a potencia do ataque
    public double attack(){
        return this.damagePoints;
    }
    /*
    (Receber Dano)
    coleta o valor do ataque recebido e retira da dos healthPoints
    caso zere os healthPoins o monstro morre, senao segue o jogo...
     */

    public void reciveDamege(double attack){
        this.healthPoints = this.healthPoints - attack;
        if (this.healthPoints <=0){
            System.out.println("Ataque Efetivo! "+this.name+" Foi Derrotado!!");

        }else if (attack == 0) {
            return;
        } else{
            System.out.printf("Ataque Efetivo!%n%s agora possui %.2f de HP restante!%n", this.name, this.healthPoints);
        }
    }



}
