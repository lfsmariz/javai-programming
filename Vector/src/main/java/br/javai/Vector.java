package br.javai;

import java.util.LinkedList;
import java.util.List;

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
    //Escreva aqui o código necessário para executar a ação dos comentários acima
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
    //Escreva aqui o código necessário para executar a ação definida nos comentários acima
  }

}
