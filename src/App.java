public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Punto miObjeto = new Punto(2, 5);
        System.out.println(miObjeto.getX() + ", " + miObjeto.getY());

        PuntoTiempo obpt = new PuntoTiempo(1, 2, 3);
        System.out.println(obpt.getX() + ", " + obpt.getY() + ", " + obpt.getT());

        Punto otroObjeto = new Punto(2, 5);
        otroObjeto.setX(4);
        int x = otroObjeto.getX();
        double d = otroObjeto.modulo();
        System.out.println(x + ", " + d);

        otroObjeto.setX(otroObjeto.getX() + 1);
        int x1 = otroObjeto.getX();
        System.out.println(x1);

        Punto p = new PuntoTiempo(1, 2, 3);
        ((PuntoTiempo)p).setT(4);
        System.out.println(((PuntoTiempo)p).getT());    //Casteo para traer t

        //PuntoTiempo pt = new Punto(2, 3); Error!!!!

        //Polimorfismo
        Punto3D p3d = new Punto3D(1, 2, 0, 10);
        System.out.println(p3d.modulo());

        Punto p3d1 = new Punto3D(1, 2, 0, 10);
        System.out.println(p3d1.modulo());
    }
}
