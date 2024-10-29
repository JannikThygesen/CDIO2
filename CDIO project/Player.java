import java.util.Scanner;
//Class to store playername and construction of new players
class Player {
  private String name;
  private int gold;
  private int rollTotal;
  
  //Constructor for objects of Player class
  public player(String name){
      this.name = name;
      this.gold = 1000;
      this.rollTotal = 0;
  }
  
  public String getName() {
    return name;
  }

  public int getGold() {
    return gold;
  }

public int[] rollDice (Dice dice) {
  int [] rolls = dice.rollTwoDice();
  System.out.println(name + " rolled: " + rolls[0] + " and " + rolls[1]);

  rollTotal = rolls[0] + rolls[1];

  System.out.println(getDescription(rollTotal));
  

  System.out.println(name + "'s total gold: " + gold);
}
//Class to store players gold values
class Account {
  String name;
  int gold;

  //Updates points and makes sure it cant get below 0
  void updatePoints(int Value) {
    this.gold = Math.max(0, this.gold += Value);
  }
  
}
