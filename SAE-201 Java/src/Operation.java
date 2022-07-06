public abstract class Operation extends Expression{

  public Expression operande1;
  public Expression operande2;

  public Operation(Expression operande1, Expression operande2){
    this.operande1 = operande1;
    this.operande2 = operande2;
    }

  public  int valeur(){
    return 0;
  };

  public  Expression getOperande1(){

    return this.operande1;
  }

  public  Expression getOperande2(){

    return this.operande2;
  }

  public  void setOperande1(Expression operande1){
    this.operande1 = operande1;
  }

  public  void setOperande2(Expression operande2){
    this.operande2 = operande2;
  }
}
