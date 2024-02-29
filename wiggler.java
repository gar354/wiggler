class Wiggler {
  private int x, y;

  Wiggler() {
    x = y = 150;
  }
  public void wiggle() {
    x+=(int)(Math.random()*5)-2;
  }
  
  public int getX() {
    return this.x;
  }
  public void setX(int _x) {
    x = _x;
  }

  public int getY() {
    return this.y;
  }
  public void setY(int _y) {
    y = _y;
  }
}
