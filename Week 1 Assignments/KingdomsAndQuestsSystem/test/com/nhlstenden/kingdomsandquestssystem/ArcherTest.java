package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcherTest
{
    @Test
    void useSpecialAbility_doublesAttackPower()
    {
        Archer archer = new Archer(40, 30);

        archer.useSpecialAbility();

        assertEquals(
                80,
                archer.getAttackPower()
        );
    }
}