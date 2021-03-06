/* Weapons.java
 * Authors: Gordon Duan & Parth Kotecha
 * Date: January 22, 2019
 * Description: This is the player class. It creates a player that gets added on to the map
 */

import java.awt.*;
abstract class Weapon{
  private int x,y;
  private int width,height;
  private int index;
  private String direction;
  private int i,j;
  public Rectangle hitBox;
  
  Weapon(int x, int y, int width, int height, String direction){
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.hitBox = new Rectangle(x-50,y+20,width-35,height-50);
  }
  public int getX(){
    return this.x;
  }
  public void setX(int x){
    this.x =  x;
  }
  public int getY(){
    return this.y;
  }  
  public void setY(int y){
    this.y = y;
  }
  public int getWidth(){
    return this.width;
  }
  public int getJ(){
    return this.j;
  }
  public void setJ(int j){
    this.j =  j;
  }
  public int getI(){
    return this.i;
  }
  public void setI(int i){
    this.i = i;
  }
  public Rectangle getHitBox(){
    return this.hitBox;
  }

  public int getHeight(){
    return this.height;
  }
  public void setHitBox(int x,int y,int width,int height){
    this.hitBox = new Rectangle(x,y,width,height);
  }

  public String getDirection(){
    return this.direction;
  }
  
  public void fire(){
  }
  
  public void draw(Graphics g, Image images[]){
    if (this.direction.equals("right")){
    g.drawImage(images[index],this.x-100,this.y,this.width+150,this.height+120,null);
    }else if (this.direction.equals("left")){
      g.drawImage(images[index],this.x+100,this.y,0-this.width-150,this.height+120,null);
    }
    //g.drawRect(this.hitBox.x,this.hitBox.y,this.hitBox.width,this.hitBox.height);
    if (index<7){
      this.index++;
    }else{
      this.index = 0;
    }
  }
}
  
  
