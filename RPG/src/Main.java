import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        int defendcount = 2;
        int randonMonster;
        int attackReact;
        int choose;

        Personagem player = null;
        Monstro monster = null;

        boolean isGameOn = true;
        boolean isPlayerAlive = true;
        boolean isMonsterAlive = true;

        while (i == 0) {
            //Criação de Personagem & Class select
            System.out.printf("ESCOLHA SUA CLASSE%n1 - Guerreiro%n2 - Mago%n3 - Arqueiro%n");
            int classe = scanner.nextInt();
            limpaChat();
            String nome;
            switch (classe) {
                case 1:
                    System.out.print("Digite o Nome do seu Guerreiro: ");
                    nome = scanner.next();
                    player = new Guerreiro(nome);
                    limpaChat();
                    System.out.println(player.name + " o Guerreiro foi Invocado!");
                    try {
                        Thread.currentThread().sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                    limpaChat();
                    i = 1;
                    break;
                case 2:
                    System.out.print("Digite o Nome do seu Mago: ");
                    nome = scanner.next();
                    player = new Mago(nome);
                    limpaChat();
                    System.out.println(player.name + " o Mago foi Invocado!");
                    try {
                        Thread.currentThread().sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                    limpaChat();
                    i = 1;
                    break;
                case 3:
                    System.out.print("Digite o Nome do seu Arqueiro: ");
                    nome = scanner.next();
                    player = new Arqueiro(nome);
                    limpaChat();
                    System.out.println(player.name + " o Arqueiro foi Invocado!");
                    try {
                        Thread.currentThread().sleep(3000);
                    } catch (InterruptedException ex) {
                    }
                    limpaChat();
                    i = 1;
                    break;
                default:
                    System.out.println("Opção invalida! Tente outra Opção...");
                    try {
                        Thread.currentThread().sleep(3000);
                    } catch (InterruptedException ex) {
                    }
            }
        }

        while (isGameOn) {
            //Enemy Generator / Seleção aleatória de Monstro
            randonMonster = random.nextInt(1, 6);
            switch (randonMonster) {
                case 1,4:
                    monster = new Monstro("Ogro Piludo", 10, 3, 0);
                    System.out.println("Um " + monster.name + " surgiu, Prepare-se para Lutar!");
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                    break;
                case 2,5:
                    monster = new Monstro("Gnomo Dotado", 10, 3.2, 0);
                    System.out.println("Um " + monster.name + " surgiu, Prepare-se para Lutar!");
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                    break;
                case 3,6:
                    monster = new Monstro("Fada Safada", 10, 3.9, 0);
                    System.out.println("Um " + monster.name + " surgiu, Prepare-se para Lutar!");
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                    break;
            }
            limpaChat();
            //Iniciando looping de batalha até que o Monstro ou o Player Morra
            while (isMonsterAlive && isPlayerAlive) {
                //Menu de Decisões
                while (i == 1) {
                    System.out.printf("\t- Menu de Combate -\n\n%s : %.2f HP\t\t%s : %.2f HP\n",
                            player.name, player.healthPoints, monster.name, monster.healthPoints);
                    System.out.printf("(1) Atacar\n(2) %s\n", player.specialname);
                    choose = scanner.nextInt();
                    limpaChat();
                    switch (choose) {
                        case 1:
                            monster.reciveDamege(player.attack());
                            try {
                                Thread.currentThread().sleep(4000);
                            } catch (InterruptedException ex) {
                            }
                            i = 2;
                            break;
                        case 2:
                            monster.reciveDamege(player.Special());
                            try {
                                Thread.currentThread().sleep(4000);
                            } catch (InterruptedException ex) {
                            }
                            i = 2;
                            break;
                        default:
                            System.out.printf("\nOpção Inválida! tente novamente...\n");
                            try {
                                Thread.currentThread().sleep(3000);
                            } catch (InterruptedException ex) {
                            }
                    }
                }
                i = 1;
                limpaChat();
                if (player.healthPoints <= 0) {
                    System.out.printf("GAME OVER\n\n%s Morreu", player.name);
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                    isPlayerAlive = false;
                    isGameOn = false;
                }
                if (monster.healthPoints <= 0) {
                    System.out.printf("%s Faleceu!! %s Segue sua Jornada...\n", monster.name, player.name);
                    isMonsterAlive = false;
                    if (isPlayerAlive) {
                        defendcount = 2;
                        player.cura();
                        System.out.printf("%s Teve sua Vitalidade Restaurada...\n", player.name);
                        try {
                            Thread.currentThread().sleep(4000);
                        } catch (InterruptedException ex) {
                        }
                        limpaChat();
                    }
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                }else{
                    System.out.printf("\n%s Preparou um golpe! Faça sua escolha...\n",monster.name);
                    try {
                        Thread.currentThread().sleep(4000);
                    } catch (InterruptedException ex) {
                    }
                    limpaChat();
                    while (i == 1) {
                        System.out.printf("\t- Menu de Reação -\n\n%s : %.2f HP\t\t%s : %.2f HP\n",
                                player.name, player.healthPoints, monster.name, monster.healthPoints);
                        System.out.printf("(1) Defender [%d] restantes\n(2) Sofrer Ataque\n",defendcount);
                        attackReact = scanner.nextInt();
                        limpaChat();
                        switch (attackReact){
                            case 1:
                                if(defendcount > 0){
                                    player.defend(monster.attack());
                                    defendcount --;
                                    i = 3;
                                    break;
                                }else{
                                    System.out.printf("\nDefesa indisponivel, tente outra coisa...\n");
                                }
                            case 2:
                                player.reciveDamege(monster.attack());
                                i = 3;
                                break;
                            default:
                                System.out.printf("\nOpção Inválida! tente novamente...\n");
                                break;
                        }
                        if (player.healthPoints <= 0) {
                            System.out.printf("GAME OVER\n");
                            try {
                                Thread.currentThread().sleep(4000);
                            } catch (InterruptedException ex) {
                            }
                            i = 3;
                            isPlayerAlive = false;
                            isGameOn = false;
                        }
                        try {
                            Thread.currentThread().sleep(4000);
                        } catch (InterruptedException ex) {
                        }
                        limpaChat();
                    }
                    i = 1;
                }


            }
            isMonsterAlive = true;
        }

    }
    public static void limpaChat () {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}



