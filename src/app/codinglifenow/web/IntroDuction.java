package app.codinglifenow.web;

import java.util.concurrent.TimeUnit;

public class IntroDuction {

    public static void main(String[] args) throws InterruptedException {

    }

    public void IntroDuction(String name) throws InterruptedException {

        utils command = new utils();
        Enemy enemy = new Enemy();

        System.out.printf("Welcome %s! Let us begin!\n", name);
        command.sleep(1000);
        System.out.printf("Zzzzzzz\n");
        command.sleep(500);
        System.out.println("You wake up with the worst headache for the first time in years. You quickly put on your gear and report to the king. If you would like to see your inventory, type .inv for your inventory or .help for a list of commands at a given prompt like this one!\n");
        command.sleep(3000);
        command.doAction();
        System.out.println("You have now learnt the basics of using this game. You .help menu will increase as you unlock new commands.");
        command.sleep(3000);
        System.out.println("You can now attack using .attk and look, it's a goblin!");
        command.sleep(750);
        enemy.enemy("Goblin", 50, 5, 1.5, new String[]{"spin attack", "axe slash", "head butt"});
        System.out.println("Very good..\n Well it looks like you are a little low on health but you thankfully have some herbs and you can use .heal to heal");
        command.inventory = command.addValue(command.inventory.length, command.inventory, "Healing herbs: " + command.healingHerbAmount);
        command.commandList = command.addValue(command.commandList.length, command.commandList, ".heal");
        command.doAction();
    }
}
