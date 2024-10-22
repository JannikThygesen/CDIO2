import java.util.Scanner;

public class Player {
  String name;
  int points;

  public player(String name, int points){
      this.name = name;
      this.points = points;
  }

  void updatePoints(int change) {
    this.points += change;
  }
  
}