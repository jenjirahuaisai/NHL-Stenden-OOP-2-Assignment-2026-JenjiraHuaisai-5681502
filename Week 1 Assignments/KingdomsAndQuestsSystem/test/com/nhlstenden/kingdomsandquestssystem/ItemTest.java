package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest
{
    @Test
    void getTitle_returnsTitle()
    {
        Item item = new Item("Magic Sword");

        assertEquals(
                "Magic Sword",
                item.getTitle()
        );
    }

    @Test
    void setTitle_changesTitle()
    {
        Item item = new Item("Magic Sword");

        item.setTitle("Golden Sword");

        assertEquals(
                "Golden Sword",
                item.getTitle()
        );
    }

    @Test
    void constructor_throwsIllegalArgumentException_whenTitleNull()
    {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Item(null)
        );
    }

    @Test
    void constructor_throwsIllegalArgumentException_whenTitleIsBlank()
    {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Item("")
        );
    }
}