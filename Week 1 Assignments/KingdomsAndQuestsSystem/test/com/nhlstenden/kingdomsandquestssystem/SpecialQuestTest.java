package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialQuestTest
{
    @Test
    void addItem_addsItemToSpecialQuest()
    {
        Character opponent = new Mage(40, 30);

        SpecialQuest specialQuest =
                new SpecialQuest(
                        7,
                        100,
                        opponent
                );

        Item item = new Item("Magic Sword");

        specialQuest.addItem(item);

        assertEquals(
                1,
                specialQuest.getItems().size()
        );
    }
}