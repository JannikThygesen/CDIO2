import java.util.Scanner;

class tileList {
  int tileNumber;
  String message;
  int value;
  
  public tile(int tileNumber, String message, int value) {
    this.tileNumber = tileNumber;
    this.message = message;
    this.value = value;
  }
    
  tile Tower = new tile(2, "You climb up the tower and find a chest with 250 goldpieces", 250);
  tile Crater = new tile(3, "You fall down a crater and drop 100 goldpieces", -100);

  //Forsæt med resten af tiles med samme format som ovenstående
}