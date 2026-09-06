package com.nhlstenden.kingdomsandquestssystem;

public abstract class Character
{
    private int attackPower;
    private int defensePower;

    public Character(int attackPower, int defensePower)
    {
        this.setAttackPower(attackPower);
        this.setDefensePower(defensePower);
    }

    public int getAttackPower()
    {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower)
    {
        this.attackPower = attackPower;
    }

    public int getDefensePower()
    {
        return this.defensePower;
    }

    public void setDefensePower(int defensePower)
    {
        this.defensePower = defensePower;
    }

    public void attack()
    {
        System.out.println("Character attacks with power " + this.getAttackPower());
    }

    public void defend()
    {
        System.out.println("Character defends with power " + this.getDefensePower());
    }

    public abstract void useSpecialAbility();
}