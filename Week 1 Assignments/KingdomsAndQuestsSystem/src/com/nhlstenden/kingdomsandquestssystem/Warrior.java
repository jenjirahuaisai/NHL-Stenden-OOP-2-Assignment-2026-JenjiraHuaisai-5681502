package com.nhlstenden.kingdomsandquestssystem;

public class Warrior extends Character
{
    private static final int ATTACK_POWER_BONUS = 10;

    private boolean specialAbilityActive;

    public Warrior(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);

        this.specialAbilityActive = false;
    }

    @Override
    public void useSpecialAbility()
    {
        if (!this.specialAbilityActive)
        {
            this.setAttackPower(
                    this.getAttackPower() + ATTACK_POWER_BONUS
            );

            this.specialAbilityActive = true;
        }
    }

    public void resetSpecialAbility()
    {
        if (this.specialAbilityActive)
        {
            this.setAttackPower(
                    this.getAttackPower() - ATTACK_POWER_BONUS
            );

            this.specialAbilityActive = false;
        }
    }
}