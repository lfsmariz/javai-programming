package br.javai.stack;

import br.javai.vector.Vector;

public class StackImple implements Stack{

  private final Vector vect;

  StackImple(){
    vect = new Vector();
  }

  StackImple(Vector vect){
    this.vect = vect;
  }

  @Override
  public void add(Integer value) {
    vect.addEnd(value);
  }

  @Override
  public Integer remove() {
    Integer retValue = vect.getElement(vect.size() - 1);
    vect.removeEnd();
    return retValue;
  }

  @Override
  public Integer size() {
    return vect.size();
  }
}
