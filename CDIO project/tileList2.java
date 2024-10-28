
class Tile {
  int tileNumber;
  String message;
  int value;
  
  public Tile(int tileNumber, String message, int value) {
    this.tileNumber = tileNumber;
    this.message = message;
    this.value = value;
  }
}

class TileList {
  Tile Tower = new Tile(2, "You climb up the tower and find a chest with 250 goldpieces", 250);
  Tile Crater = new Tile(3, "You fall down a crater and drop 100 goldpieces", -100);
  Tile PalaceGates = new Tile(4, "You reached the palace and sell your shoes for 100 goldpieces", 100);
  Tile ColdDessert = new Tile(5, "You burn some brimstones to keep warm in the cold desert. More will cost 20 goldpieces", -20);
  Tile WalledCity = new Tile(6, "You reached the Walled city and find 180 gold pieces in a chest", 180);
  Tile Monastery = new Tile(7, "You reached the sacred monastery and become one with nature. Costs nothing", 0);
  Tile BlackCave = new Tile(8, "You explore a mysterious cave and become lost. You must pay a guide 70 goldpieces to get you out", -70);
  Tile Huts = new Tile(9, "You loot abondoned huts on a remote mountain and find 60 goldpieces", 60);
  Tile Werewall = new Tile(10, "You reached a Werewall must pay 80 goldpieces because reasons. You get an extra turn", -80);
  Tile Pit = new Tile(11, "You spend 50 goldpieces eating and drinking at the tavern The Pit", -50);
  Tile Goldmine = new Tile(12, "You inherit a goldmine from a distant relative and collect 650 goldpieces from it", 650);

}

public String getDescription() {
  if (value >= 0 ) {
  return tileNumber + " " + message + ": gain " + value + " gold";  
  } else {
    return tileNumber + " " + message + ": lose " + value + " gold";
  }
}
