package com.nhlstenden.kingdomsandquestssystem;

public class Mage extends Character
{
    private static final int DEFENSE_POWER_BONUS = 10;

    public Mage(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);
    }

    @Override
    public void useSpecialAbility()
    {
        this.setDefensePower(
                this.getDefensePower() + DEFENSE_POWER_BONUS
        );
    }
}