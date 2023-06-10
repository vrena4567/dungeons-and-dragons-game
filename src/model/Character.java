package model;

public class Character {
    // Vegyél fel három fieldet: name (String), health (int) és level (int)

    // Írj egy egy paraméteres kosntruktort ami beállítja a nevet és a health 100-ra, a levelt pedig 1-re állítja!

    public void attack(Monster monster) {
        // Írd ki: [játékos neve] attacks [szötny neve]!

        // Készíts egy damage változót, legyen az értéke a level 10-szerese!
        // Vond le ezt az értéket a szörny health-jéből!

        // Írd ki: Dealt [damage változó értéke] damage to [játékos neve]!

        // Ha a szörny élete 0 vagy kisebb, írd ki: [szörny neve] has been defeated!
    }
}
