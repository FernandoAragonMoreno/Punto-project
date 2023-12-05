public class PuntoTiempo extends Punto {

  private int t;

  public PuntoTiempo(int x, int y, int t) {
    super(x, y);                            //Si no se especifica, es: super();
    this.setT(t);
  }

  public PuntoTiempo() {
    this(0,0,0);
  }

  public int getT() {
    return this.t;
  }

  /*
  FINAL: Si lo aplicamos a una clase, NO permite que existan subclases
          Si lo aplicamos a un metodo, NO permite que subclases redefinan el metodo.
  */
  public final void setT(int t) {
    this.t = t;
  }

  public double velocidad() {
    return this.modulo() / this.getT();
  }

}
