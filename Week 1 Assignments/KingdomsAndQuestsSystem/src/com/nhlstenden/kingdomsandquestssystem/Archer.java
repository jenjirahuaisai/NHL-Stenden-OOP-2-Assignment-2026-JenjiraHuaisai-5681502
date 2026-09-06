package com.nhlstenden.kingdomsandquestssystem;

public class Archer extends Character
{
    public Archer(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);
    }

    @Override
    public void useSpecialAbility()
    {
        this.setAttackPower(
                this.getAttackPower() * 2
        );
    }
}