import java.util.Random;
import java.util.Scanner;

class Game {
  private Player player1;
  private Player player2;
  private Dice dice;
  private Tile[] tiles;
  private static final int WINNING_SCORE = 3000;
  
  public Game(Player player1, Player player2, Dice dice, Tile[] tiles) {
    this.player1 = player1;
    this.player2 = player2;
    this.dice = dice;
    this.tiles = tiles;
  }
  
  public void startGame() {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      // Player 1's turn
      if (playTurn(player1, scanner)) break;
      
      // Player 2's turn
      if (playTurn(player2, scanner)) break;
      
      System.out.println("------------------------------");
    }
  }
  
  public boolean playTurn(Player player, Scanner scanner) {
    int rollTotal = 0;
    boolean extraTurn;
    do {
      extraTurn = false;
      
      System.out.println(player.getName() + ", press Enter to roll the dice.");
      scanner.nextLine();
      int[] rolls = player.rollDice(dice);  // Capture the returned rolls from the player
      
      rollTotal = rolls[0] + rolls[1];
      Tile tile = tiles[rollTotal - 2];
      int value = tile.getValue();
      player.setGold(player.getGold() + value);
      player.getAccount().updatePoints(rollTotal, tiles);
      System.out.println(tile.getDescription(rollTotal, tiles));
      System.out.println(player.getName() + "'s new total gold: " + player.getGold());

      
    // Check if player has won by reaching 3000 goldpieces
      if (player.getGold() >= WINNING_SCORE) {
      System.out.println(player.getName() + " has won the game!");
      return true;
      }
      
      // Correct check for if rolls combined are 10
      if (rolls[0] + rolls[1] == 10) {  // Ensure both dice have the same value
        System.out.println(player.getName() + " rolled 10 and gets an additional turn.");
        extraTurn = true;
      }

    } while (extraTurn);
    return false;
  }
}

class Tile {
  String tileName;
  int tileNumber;
  String message;
  int value;


  
  public Tile(String tileName, int tileNumber, String message, int value) {
    this.tileName = tileName;
    this.tileNumber = tileNumber;
    this.message = message;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String getTileName() {
    return tileName;
  }

  public int getTileNumber() {
    return tileNumber;
  }

  public String getMessage() {  
    return message;
  }

  public String getDescription(int rollTotal, Tile[] tiles) {
  Tile tile = tiles[rollTotal-2]; // subtract 2 to account for 0-indexed array
    if (tile.value >= 0 ) {
      return "Tile: " + tile.tileNumber + " " + tile.message + ": gain " + tile.value + " gold";  
    } else {
      return "Tile: " + tile.tileNumber + " " + tile.message + ": lose " + Math.abs(tile.value) + " gold";
    }
  }
}

class Dice {
  private Random random = new Random();

  public int[] rollTwoDice() {
    return new int[]{random.nextInt(6) + 1, random.nextInt(6) + 1};
  }
}


public class TileGame{
    public static void main(String[] args){
      
      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");
      Dice dice = new Dice();
      Tile[] tiles = new Tile[] {
        new Tile("Tower", 2, "You climb up the tower and find a chest with 250 goldpieces", 250),
        new Tile("Crater", 3, "You fall down a crater and drop 100 goldpieces", -100),
        new Tile("Palace Gates", 4, "You reached the palace and sell your shoes for 100 goldpieces", 100),
        new Tile("Cold Dessert", 5, "You burn some brimstones to keep warm in the cold desert. More will cost 20 goldpieces", -20),
        new Tile("Walled City", 6, "You reached the Walled city and find 180 gold pieces in a chest", 180),
        new Tile("Monastery", 7, "You reached the sacred monastery and become one with nature. Costs nothing", 0),
        new Tile("Black Cave", 8, "You explore a mysterious cave and become lost. You must pay a guide 70 goldpieces to get you out", -70),
        new Tile("Huts", 9, "You loot abondoned huts on a remote mountain and find 60 goldpieces", 60),
        new Tile("Werewall", 10, "You reached a Werewall must pay 80 goldpieces because reasons. You get an extra turn", -80),
        new Tile("Pit", 11, "You spend 50 goldpieces eating and drinking at the tavern The Pit", -50),
        new Tile("Goldmine", 12, "You inherit a goldmine from a distant relative and collect 650 goldpieces from it", 650),
        };

      Game game = new Game(player1, player2, dice, tiles);
      game.startGame();
    }
}



