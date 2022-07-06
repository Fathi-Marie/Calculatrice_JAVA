public class Multiplication extends Operation{



  public Multiplication(Nombre operande1, Nombre operande2){

    super(operande1, operande2);
    }


  public int valeur(){
    return this.operande1.getValeurNombre() * this.operande2.getValeurNombre();
  }

  public String toString(){
    return this.operande1.getValeurNombre() + " * " + this.operande2.getValeurNombre() ;
  }
}
