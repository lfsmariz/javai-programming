package br.javai;

public class Main {
  public static void main(String[] args) {
    //coloque aqui seus codigos de teste

    Vector v = new Vector();

    v.addEnd(10);
    v.addEnd(10);
    System.out.println(v.vect[1]);

    v.removeEnd();
    v.addEnd(100);


    System.out.println(v.vect[1]);


  }
}
