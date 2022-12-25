public class Hero {
     private int health;
     private int Damage ;
     private String superpower ;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        Damage = damage;
        this.superpower = superpower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        Damage = damage;

    }
}
