public class Punto3D extends PuntoTiempo{

  private int z;

  public Punto3D(int x, int y, int t, int z) {
    super(x, y, t);
    this.setZ(z);
  }

  public int getZ(){
    return this.z;
  }

  /*
  FINAL: Si lo aplicamos a una clase, NO permite que existan subclases
          Si lo aplicamos a un metodo, NO permite que subclases redefinan el metodo.
  */
  public final void setZ(int z) {
  this.z = z;
  }

  //Polimorfismo
  @Override
  public double modulo() {
    return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
  }

}
