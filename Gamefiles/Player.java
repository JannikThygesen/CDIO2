import java.util.Scanner;
//Class to store playername and construction of new players
public class Player {
  private String name;
  private int gold;
  private Account account;
  
  //Constructor for objects of Player class
    public Player(String name) {
      this.name = name;
      this.gold = 1000;
      this.account = new Account(name, gold);
    }
  

    public String getName() {
    return name;
    }

    public int getGold() {
    return gold;
    }

    public Account getAccount() {
    return account;
    }

    public void setGold(int gold) {
    this.gold = gold;
    }

  public int[] rollDice (Dice dice) {
    int [] rolls = dice.rollTwoDice();
    System.out.println(name + " rolled: " + rolls[0] + " and " + rolls[1]);
  


    System.out.println(name + "'s total gold: " + gold);

    return rolls;
  }
}
//Class to store players gold values
class Account {
  String name;
  int gold;

  public Account(String name, int gold) {
    this.name = name;
    this.gold = gold;
  }
  public int getNummer(int rollTotal, Tile[] tiles) {
    return tiles[rollTotal - 2].getValue();
  }
  //Updates points and makes sure it cant get below 0
  public void updatePoints(int rollTotal, Tile[] tiles) {
    int value = tiles[rollTotal - 2].getValue();
    this.gold = Math.max(0, this.gold += value);
  }
}

