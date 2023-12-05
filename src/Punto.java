public class Punto {

  private int x, y;

  public Punto(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public Punto(int xy) {
    this(xy, xy);
  }

  public Punto() {
    this(0,0);
  }

  /*
  FINAL: Si lo aplicamos a una clase, NO permite que existan subclases
          Si lo aplicamos a un metodo, NO permite que subclases redefinan el metodo.
  */
  public final void setX(int x) {
    this.x = x;
  }

  public final void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public double modulo() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

}