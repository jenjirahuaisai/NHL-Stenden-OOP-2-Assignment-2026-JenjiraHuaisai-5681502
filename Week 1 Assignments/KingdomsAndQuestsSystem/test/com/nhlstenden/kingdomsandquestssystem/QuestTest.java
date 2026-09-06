package com.nhlstenden.kingdomsandquestssystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestTest
{
    @Test
    void getNeededXp_returnsCorrectNeededXp()
    {
        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                100,
                opponent
        );

        assertEquals(
                70,
                quest.getNeededXp()
        );
    }

    @Test
    void getDifficultyLevel_returnsCorrectDifficultyLevel()
    {
        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                100,
                opponent
        );

        assertEquals(
                7,
                quest.getDifficultyLevel()
        );
    }

    @Test
    void getExperiencePoints_returnsCorrectExperiencePoints()
    {
        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                100,
                opponent
        );

        assertEquals(
                100,
                quest.getExperiencePoints()
        );
    }

    @Test
    void getOpponent_returnsCorrectOpponent()
    {
        Character opponent = new Warrior(50, 30);

        Quest quest = new Quest(
                7,
                100,
                opponent
        );

        assertEquals(
                opponent,
                quest.getOpponent()
        );
    }
}