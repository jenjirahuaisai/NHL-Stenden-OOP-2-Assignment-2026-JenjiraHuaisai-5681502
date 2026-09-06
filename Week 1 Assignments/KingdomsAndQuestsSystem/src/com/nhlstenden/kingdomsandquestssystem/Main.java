package com.nhlstenden.kingdomsandquestssystem;

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player(100, 1);

        Warrior warrior = new Warrior(50, 30);
        Mage mage = new Mage(40, 40);
        Archer archer = new Archer(45, 25);

        Quest quest = new Quest(
                5,
                50,
                warrior
        );

        SpecialQuest specialQuest =
                new SpecialQuest(
                        7,
                        100,
                        mage
                );

        Item magicSword =
                new Item("Magic Sword");

        specialQuest.addItem(magicSword);

        player.addQuest(quest);
        player.addQuest(specialQuest);

        player.playQuest(quest);

        System.out.println(
                "Player XP: "
                        + player.getExperiencePoints()
        );

        player.playQuest(specialQuest);

        System.out.println(
                "Player XP after special quest: "
                        + player.getExperiencePoints()
        );

        System.out.println(
                "Items earned: "
                        + player.getItems().size()
        );

        archer.useSpecialAbility();

        System.out.println(
                "Archer attack power: "
                        + archer.getAttackPower()
        );
    }
}