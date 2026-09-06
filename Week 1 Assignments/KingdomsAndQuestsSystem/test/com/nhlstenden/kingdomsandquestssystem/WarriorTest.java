package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest
{
    @Test
    void useSpecialAbility_increasesAttackPower()
    {
        Warrior warrior = new Warrior(50, 30);

        warrior.useSpecialAbility();

        assertEquals(
                60,
                warrior.getAttackPower()
        );
    }

    @Test
    void resetSpecialAbility_resetsAttackPower()
    {
        Warrior warrior = new Warrior(50, 30);

        warrior.useSpecialAbility();
        warrior.resetSpecialAbility();

        assertEquals(
                50,
                warrior.getAttackPower()
        );
    }
}