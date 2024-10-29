import java.util.Scanner;
//Class to store playername and construction of new players
class Player {
  String name;
  int gold;
  
  //Constructor for objects of Player class
  public player(String name, int gold){
      this.name = name;
      this.gold = 1000;
  }
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
