package br.javai.vector;

import java.util.Arrays;

public class Vector {

  public Integer[] vect;

  public Vector(){
    this.vect = new Integer[0];
  }

  public void addEnd(Integer value){
    Integer[] newVect = new Integer[vect.length+1];

    for (int i = 0; i < vect.length; i++) {
      newVect[i] = vect[i];
    }

    newVect[vect.length] = value;

    vect = newVect;
  }

  public void removeEnd(){
    Integer[] newVect = new Integer[vect.length-1];

    for (int i = 0; i < vect.length - 1; i++) {
      newVect[i] = vect[i];
    }

    vect = newVect;
  }

  /**
   * Utilize essa função para armazenar um novo elemento em qualquer posição de um vetor
   * @param index - indice onde o valor será inserido
   * @param value - valor a ser inserido
   *
   * ex.:
   * Vetor Original = {1, 2, 3, 4, 5}
   * v.store(2, 10)
   * Vetor após chamada = {1, 2, 10, 3, 4, 5}
   */
  public void store(Integer index, Integer value){
    Integer[] newVect = new Integer[vect.length+1];
    for (int i = 0; i < index; i++) {
      newVect[i] = vect[i];
    }

    newVect[index] = value;

    for (int i = index + 1; i < newVect.length; i++) {
      newVect[i] = vect[i-1];
    }

    vect = newVect;
  }

  /**
   * Utilize essa função para armazenar um novo elemento em qualquer posição de um vetor
   * @param index - indice onde o valor será removido
   *
   * ex.:
   * Vetor Original = {1, 2, 3, 4, 5}
   * v.extract(2)
   * Vetor após chamada = {1, 2, 4, 5}
   */
  public void extract(Integer index){
    Integer[] newVect = new Integer[vect.length-1];
    for (int i = 0; i < index; i++) {
      newVect[i] = vect[i];
    }

    for (int i = index + 1; i < vect.length; i++) {
      newVect[i-1] = vect[i];
    }

    vect = newVect;
  }

  public Integer[] getVect() {
    return vect;
  }

  public Integer getElement(int pos){
    return vect[pos];
  }

  public void setElement(int pos, int value){
    vect[pos] = value;
  }

  @Override
  public String toString() {
    return "Vector{" +
            "vect=" + Arrays.toString(vect) +
            '}';
  }

  public Integer size(){
    return vect.length;
  }

}
