//GreenTomatoes (Brandon Chong, Thet Htay Zaw, Brian Lin)
//APCS2

/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeTester2{

  public static void main(String[] args) {

    QQKachoo<String> boats = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    boats.addFirst("Yacht(y)");
    System.out.println("Added: " + boats.getFirst()); //Yacht(y)
    boats.addFirst("Cruise");
    System.out.println("Added: " + boats.getFirst()); //Cruise
    boats.addFirst("Sail");
    System.out.println("Added: " + boats.getFirst()); //Sail
    boats.addFirst("Row");
    System.out.println("Added: " + boats.getFirst()); //Row

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Row Sail Cruise Yacht(y)

    System.out.println("");

    System.out.println("-----Adding to end------");
    boats.addLast("Speed");
    System.out.println("Added: " + boats.getLast()); //Speed
    boats.addLast("Fishing");
    System.out.println("Added: " + boats.getLast()); //Fishing
    boats.addLast("Lil'");
    System.out.println("Added: " + boats.getLast()); //Lil

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Row Sail Cruise Yacht(y) Speed Fishing Lil

    System.out.println("");

    System.out.println("-----Removing from front-----");
    boats.removeFirst(); //Row  dies
    System.out.println("New front: " + boats.getFirst()); //Sail

    System.out.println("");

    System.out.println("-----Removing from end-----");
    boats.removeLast(); //Lil dies
    System.out.println("New end: " + boats.getLast()); //Fishing

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Sail Cruise Yacht(y) Speed Fishing

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    boats.removeFirst();
    System.out.println(boats);
    boats.removeLast();
    System.out.println(boats);
    boats.removeFirst();
    System.out.println(boats);
    boats.removeLast();
    System.out.println(boats);
    boats.removeFirst();
    System.out.println(boats);
    //System.out.println("Empty now?: " + boats.isEmpty()); //true
  }

}
