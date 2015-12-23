package model.skills;

public enum BasicSkills implements Skill {
    
    TACKLE("Tackle", 5, 1), 
    PUNCH("Punch", 7, 1),
    KICK("Kick", 10, 3);
    
    private final String name;
    private int damage;
    private int requiredLevel;
    
    private BasicSkills(final String name, final int damage, final int requiredLevel) {
        this.name = name;
        this.damage = damage;
        this.requiredLevel = requiredLevel;
    }
    
    /**
     * @return returns the name with the first letter capitalized only
     *          (this.name() returns the full capitalized name, we don't like it)
     */
    public String getName() {
        return this.name;       
    }

    public int getDamage() {
        return this.damage;
    }
    
    public int getRequiredLevel() {
        return this.requiredLevel;
    }
    
}
