  public class Card { 
    
    private int quantity; 
    private int color; 
    private int shading; 
    private int shape; 
   
  public Card(int quant, int colored, int shade ,int shapes){ 
    //Start with quantity
    if (quant ==1 || quant==2 || quant ==3){ //Makes sure that each number is equal to either 1,2,3 
      quantity=quant; //if they are, they get assigned into quantity 
    } 
     
    if (quant <=0){    //this is for if they are negative or equal to zero. 
        quantity=((((quant %3)+3)%3)+1); 
    } 
     
    if(quant > 3){ //i assume this would work if it is greater than three) 
        quantity=((quant %3)+1); 
    } 
    // Start with color   
    if (colored ==1 || colored ==2 || colored ==3 ){ 
     color= colored; 
    } 
     
    if(colored <=0){ 
      color=((((colored %3)+3)%3)+1); 
    } 
    if (colored >3){ 
      color=((colored %3)+1); 
    } 
    //end color 
     
    //Start of Shading 
    if (shade ==1 || shade == 2 || shade ==3 ){ 
      shading=shade; 
    } 
    if (shade <=0){ 
      shading=((((shade %3)+3)%3)+1); 
    } 
    if (shade > 3){ 
      shading=((shade %3)+1); 
    } 
    
    //end shading 
     
    // Start with Shape 
    if (shapes ==1 || shapes ==2 || shapes ==3 ){ 
     shape= shapes; 
    } 
     
    if(shapes <=0){ 
      shape=((((shapes %3)+3)%3)+1); 
    } 
    if (shapes >3){ 
      shape=((shapes %3)+1); 
    } 
    //end of shape 
  } 
   
  // #Perfection             
  public int getQuantity(){ 
    return quantity; 
  } 
   
  public int getColor(){ 
    return color; 
  } 
  public int getShading(){ // This should not give me any errors
    return shading; 
  } 
  public int getShape(){ 
    return shape; 
  } 
 
   
  public boolean isSet( Card c1, Card c2){ 
   //perhaps not..... 
    // (\._./) 
    if ((((quantity + c1.getQuantity()+ c2.getQuantity())%3)==0) &&
        (((color + c1.getColor() + c2.getColor())%3)==0) && (((shape + c1.getShape()+c2.getShape())%3)==0)  && (((shading + c1.getShading() + c2.getShading())%3)==0)){
      return true;
    }
      
      else{
        return false;
      }
    }
  
       
   
  public String toString(){ 
   
    String str=""; 
    str += quantity;
     
    // Adding Color into string 
    if (color==1){ 
      str += "R"; 
    } 
    if (color ==2){ 
      str += "G"; }
    
    if (color ==3){ 
      str += "P"; 
    }
    // Adding shadding into string 
     
    if (shading ==1){ 
      str+= "O"; 
    } 
    if (shading ==2){ 
      str += "T"; 
    } 
    if (shading ==3){ 
      str+= "S"; 
    } 
    // Adding shape into shape  
    if (shape ==1){ 
      str += "O"; 
    } 
    if (shape ==2){ 
      str += "D"; 
    } 
    if (shape ==3){ 
      str+="S"; 
    } 
    return str;
  } 
   
  public boolean equals(Object obj) { 
    Card that = (Card)obj; 
     
    return quantity == that.getQuantity() && 
      color == that.getColor() && 
      shading == that.getShading() && 
      shape == that.getShape(); 
  }
  }


