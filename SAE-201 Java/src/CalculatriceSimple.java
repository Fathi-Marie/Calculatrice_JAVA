public class CalculatriceSimple {
    public static void main(String[] args) {

        try {
            Expression deux = new Nombre(2) ;
            Expression trois = new Nombre(3) ;
            Expression dixSept = new Nombre(17) ;
            Expression s = new Multiplication((Nombre) dixSept, (Nombre)deux) ;
        } catch (ArithmeticException e) {
            System.out.println("une division par 0 est impossible !");
        }
    }
}
