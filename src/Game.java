import model.Character;
import model.Monster;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Kérd meg a felhasználót, hogy adja meg a karaktere nevét és ezt olvasd be egy változóba!
        // (Használj Scannert!)
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a karakternevedet:");
        String name = sc.nextLine();

        // Példányosíts egy Charactert (hívd meg a konstruktorát) ezzel a változóval!
        Character jatekos = new Character(name);

        // Írd ki: Welcome, [játékos neve]!
        System.out.println("Welcome, " + jatekos);

        // Készíts egy 3 hosszúságú tömböt Monster-ekből!
        Monster[] monsters = new Monster[3];
        // Töltsd fel szörnyekkel! Példa: monsters[0] = new Monster("Goblin", 50);
        monsters[0] = new Monster("Goblin", 50);
        monsters[1] = new Monster("Alejandro", 70);
        monsters[2] = new Monster("Abrakadabra", 40);
        // Készíts egy gameOver nevű logikai változót, állítds az értékét false-ra!

        // Írj egy ciklust, ami addig tart amíg nincs vége a játéknek (amíg a gameOver nem true) ÉS
        // amíg a karakter élete 0-nál nagyobb!

            // Írd ki: Choose a monster to fight or quit:

            // Írd ki: 0: Quit

            // Írd ki a Monstereket tartalmazó tömb összes elemének a nevét ebben a formátumban:
            // 1: Goblin
            // 2: Troll
            // 3: Dragon

            // Olvasd be egy choice nevű változóba a felhasználótól, hogy mit választ: kilép vagy valamelyik
            // szörnnyel harcol!

            // Ha azt választja, hogy kilép (0), írd ki: Thanks for playing! Goodbye.
            // És állítsd be a gameOver változó értékét true-ra!

            // Ha jó inputot ad meg (1 és tömb hossza között) és harcol:
            // Tárold el egy Monster típusú változóban, hogy melyiket választotta a felhasználó!

            // Írj egy ciklust, ami addig megy, amíg a szörny és a játékos élete is nagyobb mint 0!
                // Támadja meg a felhasználó karaktere a szörnyet!
                // Ha a szörny élete továbbra is nagyobb, mint 0, akkor a szörny támadjon vissza!

        // Ha rossz inputot ad meg, írd ki: Invalid choice!

    }
}
