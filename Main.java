import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    while (true) {
      Scanner in = new Scanner(System.in);
      char truevalue;
      
      System.out.print("Please enter a message: ");
      String input = in.nextLine();

      ArrayList <Character> list = new ArrayList <Character>();
      ArrayList <Character> vowels = new ArrayList<Character>();
      //to get into an array
    
      for (int i = 0; i < input.length(); i++) {
        list.add(i, input.charAt(i));
      }

      for (int i = 0; i < list.size(); i++) {
        for (i = 0; i < list.size(); i++) {
          if (list.get(i) == 'a' || list.get(i) == 'e' || list.get(i) == 'i' || list.get(i) == 'o' || list.get(i) == 'u') {
          vowels.add(i , list.get(i));
          }
        }
      }

      for (;;) {
        boolean sorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
          if (list.get(i) == 'a' || list.get(i) == 'e' || list.get(i) == 'i' || list.get(i) == 'o' || list.get(i) == 'u') {
            if (list.get(i) > vowels.get(i));
              truevalue = list.get(i);
            list.set(i , vowels.get(i));
            vowels.set(i, truevalue);
            sorted = false;
          }
        }

        if (sorted = true)
          break;
      }
      for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i));
      }
    }  
  }
}