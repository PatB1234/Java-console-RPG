package app.codinglifenow.web;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class utils {

    public static void main(String[] args) {


    }

    public Random randomNum = new Random();

    public String Sword = ("Wooden Sword");
    public String Armour = ("Chainmail Armour");

    public int Protection = 5;
    public int Damage = 5;
    public int playerCooldown = 2;
    public static int playerHealth = 100;
    public int healingPower = 5;
    public int healingHerbAmount = 5;

    public String[] inventory = {(Sword + ", Damage: " + Damage), (Armour + ", Protection: " + Protection)};
    public String[] commandList = {".inv", ".help", ".quit", ".attk"};

    public void doAction() {

        System.out.println("What would you like to do");
        try {

            Enemy enemyConnection = new Enemy();

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase(".inv")) {

                System.out.println("Your inventory is");
                for(int i = 0; i < inventory.length; i++) {

                    System.out.printf("%s\n", inventory[i]);
                }

            } else if(command.equalsIgnoreCase(".help")) {

                System.out.println("Command list is:");
                for(int i = 0; i < commandList.length; i++) {

                    System.out.printf("%s\n", commandList[i]);
                }

            } else if(command.equalsIgnoreCase(".quit")) {

                System.out.println("I hope to see you again! Byeeeee");
                System.exit(0);
            } else if (command.equalsIgnoreCase(".attk")) {

                enemyConnection.damageEnemy(enemyConnection.publicEnemeyHealth);
            } else if(command.equalsIgnoreCase(".heal")) {

                if (playerHealth < 100) {

                    playerHealth += healingPower;
                    System.out.printf("Healed %d hp, current health is %d\n", healingPower, playerHealth);
                    healingHerbAmount -= 1;
                    updateInventoryArrayHealing();
                } else if (playerHealth == 100) {

                    System.out.println("You are already at max health");
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void sleep(int time) throws InterruptedException {

        TimeUnit.MILLISECONDS.sleep(time);
    }

    public String[] addValue(int n, String[] arr, String valueToAdd)
    {
        int i;

        String newarr[] = new String[n + 1];

        for (i = 0; i < n; i++) {

            newarr[i] = arr[i];
        }

        newarr[n] = valueToAdd;
        return newarr;
    }

    public void updateInventoryArrayHealing() {

        for(int i = 0; i < inventory.length; i++) {

            String[] inventorySplit = inventory[i].split(" ");

            for(int a = 0; a < inventorySplit.length; a++) {

                if(inventorySplit[a].equalsIgnoreCase("Healing")) {

                    inventory[i] = ("Healing herbs: " + healingHerbAmount);
                }
            }
        }
    }
}
