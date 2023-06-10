package model;

public class Monster {

    // Vegyél fel két fieldet: name (String) és health (int)
    private String name;
    private int health;

    // Írj egy két paraméteres kosntruktort ami beállítja az attribútumok értékeit!
    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void attack(Character player) {
        // Írd ki: [szörny neve] attacks [játékos neve]!
        System.out.println(name + " attacks " + player);
        // Csökkentsd a játékos életét 20-szal!

        // Írd ki: Dealt 20 damage to [játékos neve]!

        // Ha a játékos élete 0 vagy kisebb, írd ki: [játékos neve] has been defeated!

    }
}