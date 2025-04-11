import java.util.*;

class RPSPlayer {
    String name;
    String choice;

    RPSPlayer(String name) {
        this.name = name;
    }

    void makeChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        choice = options[new Random().nextInt(3)];
    }

    String getChoice() {
        return choice;
    }
}

class RockPaperScissors {
    public static void main(String[] args) {
        RPSPlayer p1 = new RPSPlayer("Alice");
        RPSPlayer p2 = new RPSPlayer("Bob");
        p1.makeChoice();
        p2.makeChoice();
        System.out.println(p1.name + ": " + p1.getChoice());
        System.out.println(p2.name + ": " + p2.getChoice());
        if (p1.getChoice().equals(p2.getChoice())) System.out.println("Draw");
        else if ((p1.getChoice().equals("Rock") && p2.getChoice().equals("Scissors")) ||
                (p1.getChoice().equals("Paper") && p2.getChoice().equals("Rock")) ||
                (p1.getChoice().equals("Scissors") && p2.getChoice().equals("Paper")))
            System.out.println(p1.name + " wins!");
        else
            System.out.println(p2.name + " wins!");
    }
}
