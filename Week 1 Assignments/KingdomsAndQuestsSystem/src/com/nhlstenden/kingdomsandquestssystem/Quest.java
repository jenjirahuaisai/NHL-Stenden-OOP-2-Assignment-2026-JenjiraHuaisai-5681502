package com.nhlstenden.kingdomsandquestssystem;

public class Quest
{
    private int difficultyLevel;
    private int experiencePoints;
    private Character opponent;

    public Quest(
            int difficultyLevel,
            int experiencePoints,
            Character opponent
    )
    {
        this.setDifficultyLevel(difficultyLevel);
        this.setExperiencePoints(experiencePoints);
        this.setOpponent(opponent);
    }

    public int getDifficultyLevel()
    {
        return this.difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel)
    {
        this.difficultyLevel = difficultyLevel;
    }

    public int getExperiencePoints()
    {
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints)
    {
        this.experiencePoints = experiencePoints;
    }

    public Character getOpponent()
    {
        return this.opponent;
    }

    public void setOpponent(Character opponent)
    {
        if (opponent == null)
        {
            throw new IllegalArgumentException(
                    "Opponent cannot be null"
            );
        }

        this.opponent = opponent;
    }

    public int getNeededXp()
    {
        return this.getDifficultyLevel() * 10;
    }
}