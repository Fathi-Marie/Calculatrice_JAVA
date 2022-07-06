public class Division extends Operation{


  public Division(Nombre operande1, Nombre operande2) {
    super(operande1, operande2);
  }

  public int valeur() throws ArithmeticException{

    return this.operande1.getValeurNombre() / this.operande2.getValeurNombre();
  }

  public String toString(){

    return this.operande1.getValeurNombre() + " / " + this.operande2.getValeurNombre() ;
  }
}
