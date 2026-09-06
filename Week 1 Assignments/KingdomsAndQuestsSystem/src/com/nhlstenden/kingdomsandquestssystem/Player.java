package com.nhlstenden.kingdomsandquestssystem;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private int experiencePoints;
    private int level;

    private List<Quest> availableQuests;
    private List<Item> items;

    public Player(int experiencePoints, int level)
    {
        this.setExperiencePoints(experiencePoints);
        this.setLevel(level);

        this.availableQuests = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public int getExperiencePoints()
    {
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints)
    {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel()
    {
        return this.level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public List<Quest> getAvailableQuests()
    {
        return this.availableQuests;
    }

    public List<Item> getItems()
    {
        return this.items;
    }

    public void addQuest(Quest quest)
    {
        this.availableQuests.add(quest);
    }

    public void addExperiencePoints(int amount)
    {
        this.setExperiencePoints(
                this.getExperiencePoints() + amount
        );
    }

    public void levelUp()
    {
        if (this.getExperiencePoints() >= 200)
        {
            this.setLevel(
                    this.getLevel() + 1
            );
        }
    }

    public void playQuest(Quest quest)
    {
        if (this.getExperiencePoints() >= quest.getNeededXp())
        {
            this.addExperiencePoints(
                    quest.getExperiencePoints()
            );

            if (quest instanceof SpecialQuest)
            {
                SpecialQuest specialQuest = (SpecialQuest) quest;

                this.items.addAll(
                        specialQuest.getItems()
                );
            }
        }
    }
}