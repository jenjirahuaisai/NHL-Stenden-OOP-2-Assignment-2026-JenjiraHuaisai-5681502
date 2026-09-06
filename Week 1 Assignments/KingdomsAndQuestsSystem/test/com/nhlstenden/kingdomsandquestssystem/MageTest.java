package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MageTest
{
    @Test
    void useSpecialAbility_increasesDefensePower()
    {
        Mage mage = new Mage(40, 30);

        mage.useSpecialAbility();

        assertEquals(
                40,
                mage.getDefensePower()
        );
    }
}