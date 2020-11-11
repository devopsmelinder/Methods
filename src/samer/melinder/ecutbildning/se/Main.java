package samer.melinder.ecutbildning.se;

public class Main {

    //Variabler nedan som används i konstruktorn
    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;

    static int hammer = (int) (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage + 1)) + hammerMinimumDamage);
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * ( magicWandMaximumDamage - magicWandMinimumDamage));

    //Konstruktorn nedan
    public Main(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;


        //nu kan man instansera en ny karaktär
    }

    //En ny metod som inte återkommer
    public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String attackerWeaponName) {
        if (hp <=0 || attackerWeaponName == " Excalibur ") {
            System.err.println(defenderName + " YOU CANNOT ATTACK ");

        }else {
            System.err.println("WILD " + attackerName + " APPEARS!");
            System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE ");
            hp = (hp - attackerWeaponDamage);
            System.out.println((defenderName + " HAS " + hp + " REMAINING HEALTH! "));

        }

    }

    public void searchWeapon(String weaponName) {
        switch (weaponName) {
            case " goodGuy ":
                System.out.println("The goodGuy loves his hammer");
                break;

            case " badGuy ":
                System.out.println("Vader don´t need his Laser, the dark force is his ultimate weapon ");
                break;

            default:
                System.out.println("Weapon Name you're looking for is not in use ");
                break;

        }
    }
    // metod nr 2 drinking healing potion
    public void drinkingHealingPotion(){
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName +  " GAINED " + healingPotion + "HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " REMAINING HEALTH " + hp);


    }

    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main badGuy = new Main("Vader", magicWand, 80, "Magic Wand");

        System.out.println(goodGuy.hp);
        goodGuy.beingAttacked(goodGuy.characterName, badGuy.characterName, badGuy.weaponDamage, badGuy.weaponName);
        badGuy.beingAttacked((badGuy.characterName), goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName);
        goodGuy.drinkingHealingPotion();
        badGuy.drinkingHealingPotion();

        try {
            int i = 1;
            int j = i + 3;
            System.out.println("Yay" + j);
        } catch (Exception e) {
            System.out.println("No way");
        }

    }}