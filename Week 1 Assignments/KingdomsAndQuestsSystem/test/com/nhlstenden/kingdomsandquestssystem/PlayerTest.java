package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest
{
    @Test
    void addExperiencePoints_addsExperiencePoints()
    {
        Player player = new Player(100, 5);

        player.addExperiencePoints(50);

        assertEquals(
                150,
                player.getExperiencePoints()
        );
    }

    @Test
    void levelUp_increasesLevel_whenExperiencePointsAreAtLeast200()
    {
        Player player = new Player(220, 5);

        player.levelUp();

        assertEquals(
                6,
                player.getLevel()
        );
    }

    @Test
    void levelUp_doesNotIncreaseLevel_whenExperiencePointsAreBelow200()
    {
        Player player = new Player(199, 5);

        player.levelUp();

        assertEquals(
                5,
                player.getLevel()
        );
    }

    @Test
    void playQuest_addsExperiencePoints_whenPlayerHasEnoughXp()
    {
        Player player = new Player(100, 1);

        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                50,
                opponent
        );

        player.playQuest(quest);

        assertEquals(
                150,
                player.getExperiencePoints()
        );
    }

    @Test
    void playQuest_doesNotAddExperiencePoints_whenPlayerDoesNotHaveEnoughXp()
    {
        Player player = new Player(50, 1);

        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                50,
                opponent
        );

        player.playQuest(quest);

        assertEquals(
                50,
                player.getExperiencePoints()
        );
    }

    @Test
    void addQuest_addsQuestToAvailableQuests()
    {
        Player player = new Player(100, 1);

        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                50,
                opponent
        );

        player.addQuest(quest);

        assertEquals(
                1,
                player.getAvailableQuests().size()
        );
    }

    @Test
    void playSpecialQuest_addsItemsToPlayer()
    {
        Player player = new Player(100, 1);

        Character opponent = new Mage(40, 30);

        SpecialQuest specialQuest =
                new SpecialQuest(
                        7,
                        50,
                        opponent
                );

        specialQuest.addItem(
                new Item("Magic Sword")
        );

        player.playQuest(specialQuest);

        assertEquals(
                1,
                player.getItems().size()
        );
    }
}