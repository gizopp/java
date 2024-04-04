package pkginterface.gizopp;

public class InterfaceGizopp {

    public static void main(String[] args) {
        FormaGeometrica c = new Circulo(2);
        System.out.println("A área do círculo corresponde á " + c.calcularArea());
        
        FormaGeometrica q = new Quadrado(3);
        System.out.println("A área do quadrado corresponde á " + q.calcularArea());
    }
    
}
