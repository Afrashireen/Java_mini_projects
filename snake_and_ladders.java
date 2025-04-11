import java.util.*;

class Player {
    String name;
    int position = 0;

    Player(String name) {
        this.name = name;
    }

    void move(int steps) {
        position += steps;
        if (position == 14) position = 4;
        else if (position == 9) position = 31;
        if (position > 100) position = 100;
    }

    boolean hasWon() {
        return position >= 100;
    }
}

class SnakesAndLadders {
    public static void main(String[] args) {
        Player p1 = new Player("Alice");
        Random rand = new Random();
        while (!p1.hasWon()) {
            int dice = rand.nextInt(6) + 1;
            p1.move(dice);
            System.out.println(p1.name + " is at " + p1.position);
        }
        System.out.println(p1.name + " wins!");
    }
}