public class Card {
  private int quantity;
  private int color;
  private int shading;
  private int shape;
  
  public Card(int currentquantity, int currentcolor, int currentshading, int currentshape) {     
    quantity = currentquantity;
    color = currentcolor;
    shading= currentshading;
    shape=currentshape;
    
}
  // Create the rest of this class yourself
  
  public boolean equals(Object obj) {
    Card that = (Card)obj;
    
    return quantity == that.getQuantity() &&
      color == that.getColor() &&
      shading == that.getShading() &&
      shape == that.getShape();
  }
}
