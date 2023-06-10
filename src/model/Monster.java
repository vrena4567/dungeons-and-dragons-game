package model;

public class Monster {

    // Vegyél fel két fieldet: name (String) és health (int)
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Írj egy két paraméteres kosntruktort ami beállítja az attribútumok értékeit!
    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void attack(Character player) {
        // Írd ki: [szörny neve] attacks [játékos neve]!
        System.out.println(name + " attacks " + player);
        // Csökkentsd a játékos életét 20-szal!
        Character jatekos = new Character();
        jatekos.setHealth(jatekos.getHealth()-20);
        // Írd ki: Dealt 20 damage to [játékos neve]!
        System.out.println("Dealt 20 damage to " + jatekos.getName() + "!");
        // Ha a játékos élete 0 vagy kisebb, írd ki: [játékos neve] has been defeated!
        if(jatekos.getHealth() <= 0) {
            System.out.println(jatekos.getName() + " has been defeated!");
        }
    }
}