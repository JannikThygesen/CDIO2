import java.util.Scanner;

public class tileGame{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      //Hvis flere end 2 spillere skal kunne være med
      /* int numberOfPlayers = scanner.nextInt();

    
      Player[] players = new Player[numberOfPlayers]; */



      //Hvis de skal kunne navngive player 1 og 2
      /* 
      for (int i = 0; i < 2; i++) {
        String name = scanner.nextLine();


        
      }
      */
    }
   

}


class tile {
  int tilenumber;
  String message;
  int value;
  
  public tile(int tilenumber, String message, int value) {
    this.tilenumber = tilenumber;
    this.message = message;
    this.value = value;
  }
  

}


class Player {
    String name;
    int points;

    public player(String name, int points){
        this.name = name;
        this.points = points;
    }

}

