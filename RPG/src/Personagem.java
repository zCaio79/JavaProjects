public class Personagem extends Entidade{
    public Personagem(String name, double healthPoints, double damagePoints, double shield){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
        this.shield = shield;
    }
    //(Atacar) Retorna a potencia do ataque
    public double attack(){return this.damagePoints;}
    /*
    (Defender Ataque)
    coleta o valor do ataque recebido, aspect de shield define se
    o ataque sera bloqueado completamente ou parcialmente a partir
    da força do ataque...
     */
    public void defend(double attack){
        double damage = attack - this.shield;
        if(damage > 0){
            this.healthPoints -= damage;
            System.out.printf("%s Defendeu parcialmente! %n%s agora possui %.2f de HP restante!%n", this.name, this.name, this.healthPoints);
        }else{
            System.out.printf("%s Defendeu completamente!%n", this.name);
        }
    }
    public void reciveDamege(double attack){
        this.healthPoints = this.healthPoints - attack;
        if (this.healthPoints <=0){
            System.out.println("Você foi Atingido! "+this.name+" Você Morreu!!");

        }else{
            System.out.printf("Você foi Atingido!%n%s agora possui %.2f de HP restante!%n", this.name, this.healthPoints);
        }
    }
}
