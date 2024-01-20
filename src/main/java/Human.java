public class Human extends Entity{
private int health = 100;
private int defense = 0;
private int strenght = 0;
private int intelligence = 0;
private int crit_chance=0;
private int crit_damage = 0;

    public Human() {
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Setter
     * @param defense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setCrit_chance(int crit_chance) {
        this.crit_chance = crit_chance;
    }

    public void setCrit_damage(int crit_damage) {
        this.crit_damage = crit_damage;
    }

    /**
     * Getter
     * @return
     */
    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCrit_chance() {
        return crit_chance;
    }

    public int getCrit_damage() {
        return crit_damage;
    }
}
