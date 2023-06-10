package model;

public class Character {
    // Vegyél fel három fieldet: name (String), health (int) és level (int)
    private String name;
    private int health;
    private int level;

    // Írj egy egy paraméteres kosntruktort ami beállítja a nevet és a health 100-ra, a levelt pedig 1-re állítja!
    public Character(String name){
        this.name = name;
        this.health =100;
        this.level = 1;
    }

    public void attack(Monster monster) {
        // Írd ki: [játékos neve] attacks [szötny neve]!
        System.out.println("A játékos: " + name + " a szörny " + monster);

        // Készíts egy damage változót, legyen az értéke a level 10-szerese!
        // Vond le ezt az értéket a szörny health-jéből!
        int damage = (level*10);


        // Írd ki: Dealt [damage változó értéke] damage to [játékos neve]!

        // Ha a szörny élete 0 vagy kisebb, írd ki: [szörny neve] has been defeated!
    }
}
