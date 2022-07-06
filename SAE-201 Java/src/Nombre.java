public class Nombre extends Expression{

  private int valeurNombre;

  public Nombre(int valeurNombre){

    this.valeurNombre = valeurNombre;
  }

  @Override
  public int valeur() {
    return 0;
  }

  public String toString(){

    return "la valeur du nombre est de "+this.valeurNombre;
  }

  public int getValeurNombre(){

    return this.valeurNombre;
  }

  public void setValeurNombre(int nombre){

    this.valeurNombre = nombre;
  }

}
