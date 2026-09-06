package com.nhlstenden.kingdomsandquestssystem;

import java.util.ArrayList;
import java.util.List;

public class SpecialQuest extends Quest
{
    private List<Item> items;

    public SpecialQuest(
            int difficultyLevel,
            int experiencePoints,
            Character opponent
    )
    {
        super(difficultyLevel, experiencePoints, opponent);

        this.items = new ArrayList<>();
    }

    public List<Item> getItems()
    {
        return this.items;
    }

    public void addItem(Item item)
    {
        if (item == null)
        {
            throw new IllegalArgumentException(
                    "Item cannot be null"
            );
        }

        this.items.add(item);
    }
}