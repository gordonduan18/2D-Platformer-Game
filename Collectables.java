/* Collectables.java
 * Authors: Gordon Duan & Parth Kotecha
 * Date: January 22, 2019
 * Description: The collectable class. It will be extended by the gems and star
 */

import java.awt.*;
abstract class Collectables{
  
  //Declare class variables
  private int i,j;
  private int width,height;
  private int index;
  private boolean collected;
  private Rectangle hitBox;
      
  
  Collectables(int i, int j, int width, int height){
    this.i = i;
    this.j = j;
    this.width = width;
    this.height = height;
    this.collected = false;
    this.hitBox = new Rectangle(this.j*this.width+40,this.i*this.height+40,this.width-63,this.height-40);
  }
  public int getI(){
    return this.i;
  }  
  public int getJ(){
    return this.j;
  }  
  public int getWidth(){
    return this.width;
  }  
  public void setWidth(int width){
    this.width = width;
  }
  public int getHeight(){
    return this.height;
  } 
  public void setHeight(int height){
    this.height = height;
  }
  public Rectangle getHitBox(){
    return this.hitBox;
  }
  public boolean getCollected(){
    return this.collected;
  }
  public void setHitBox(int x,int y,int width,int height){
    this.hitBox = new Rectangle(x,y,width,height);
  }
  public void setCollected(boolean collected){
    this.collected = collected;
  }
  public void draw(Graphics g,Image[]images){
    g.drawImage(images[index],this.hitBox.x-10,this.hitBox.y,this.hitBox.width+20,this.hitBox.height,null);
    if (index<7){
      this.index++;
    }else{
      this.index = 0;
    }
  }
}
