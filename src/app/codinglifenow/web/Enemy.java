package app.codinglifenow.web;

import java.util.Random;

public class Enemy {

    public static void main(String[] args) {


    }

    public static int publicEnemeyHealth;
    public boolean ifEnemyNearby = false;

    public void enemy(String enemyType, int enemyHealth, int enemyDamage, double enemyCoolDown, String[] catchphraseString) throws InterruptedException {

        utils utilsConnection = new utils();
        publicEnemeyHealth = enemyHealth;
        ifEnemyNearby = true;

        //System.out.printf("%s, %d, %d, %f\n", enemyType,enemyHealth, enemyDamage, enemyCoolDown);
        System.out.printf("Enemy is a %s, enemy health this %d and the cooldown is %f\n", enemyType, enemyHealth, enemyCoolDown);

        while (ifEnemyNearby == true) {

            System.out.println("Do you want to attack with .attk or .quit or see your .inv");
            System.out.printf("Your cooldown is starting and it is %d seconds\n", utilsConnection.playerCooldown);
            utilsConnection.sleep(utilsConnection.playerCooldown);
            utilsConnection.doAction();

            Random randomNum = new Random();

            int shouldEnemyAttack = randomNum.nextInt(2);
            int damageAmount = randomNum.nextInt(enemyDamage);
            int catchphraseNum = randomNum.nextInt(catchphraseString.length);

            String catchphrase = catchphraseString[catchphraseNum];

            if (shouldEnemyAttack == 1) {

                System.out.printf("Enemy has used %s attack and has dealt %d damage to you\n", catchphrase ,damageAmount);
                utilsConnection.playerHealth -= damageAmount;
                System.out.printf("Your health is now %d\n", utilsConnection.playerHealth);
            }

            if (publicEnemeyHealth == 0) {

                System.out.println("Enemy deafeated!");
                ifEnemyNearby = false;
                break;
            }
        }

    }

    public void damageEnemy(int enemyHealth) {

        utils utilsConnection = new utils();

        publicEnemeyHealth -= utilsConnection.Damage;
        System.out.printf("Enemy health is now %d\n", publicEnemeyHealth);
    }
}
