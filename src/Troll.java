public class Troll extends Monster{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}