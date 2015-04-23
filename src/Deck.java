import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
  private ArrayList<Card> cards;
  private int nextCardIndex;
  
  public Deck(){
    for (int carrd1=1; carrd1<=3; carrd1++){
      for (int carrd2=1; carrd2 <=3; carrd2++){
        for (int carrd3=1; carrd3 <=3; carrd3++){
          for (int carrd4=1; carrd4 <=3; carrd4++){
            cards.add(new Card(carrd1, carrd2, carrd3,carrd4));
          }
        }
      }
    }
  nextCardIndex=0;
  }
  
    public Deck (String filename) {
    cards = new ArrayList<Card>(81);
    
    try{
      
      String line;
      BufferedReader infile = new BufferedReader(new FileReader(filename));
      int position = 0;
  
      while((line = infile.readLine()) != null) {
        // Blank lines might contain white space, so trim it off
        line = line.trim();
        
        // ignore blank lines
        if(line.length() == 0)
          continue;
        
        // ignore comments
        if(line.startsWith("#"))
          continue;
            
        // a valid line contains 4 integers
        StringTokenizer tokenizer = new StringTokenizer(line);
        
        int quantity = Integer.parseInt(tokenizer.nextToken());
        int color = Integer.parseInt(tokenizer.nextToken());
        int shading = Integer.parseInt(tokenizer.nextToken());
        int shape = Integer.parseInt(tokenizer.nextToken());
        
        cards.add(new Card(quantity, color, shading, shape));
        nextCardIndex = 0;
      }
    }
    catch(Exception e) {
      throw new RuntimeException("Error while reading file: " + e.toString());
    }
  }
  
  public boolean hasNext(){
    // Returns true if any cards are left, false otherwise.
    if (nextCardIndex < cards.size()){
      return true;
    }
    else{
      return false;
    }
  }
  
    
  
  public Card getNext(){
    if (hasNext() == false){
      return null ;
    }
    else{
      nextCardIndex +=1;
      return cards.get(nextCardIndex-1);
    }
  }
  
    // Returns the next card in the deck if there is one, null otherwise
    
    // You can call hasNext() within this method to see if you should return a card or return nulll
    

}
