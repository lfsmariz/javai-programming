package br.javai;

import br.javai.binary.BinaryTree;

public class Main {
  public static void main(String[] args) {
    //coloque aqui seus codigos de teste

//    Vector v = new Vector();
//
//    v.addEnd(10);
//    v.addEnd(10);
//    System.out.println(v.vect[1]);
//
//    v.removeEnd();
//    v.addEnd(100);
//
//
//    System.out.println(v.vect[1]);

    BinaryTree binTree = new BinaryTree();

    binTree.insert(8);
    binTree.insert(3);
    binTree.insert(10);
    binTree.insert(1);
    binTree.insert(6);
    binTree.insert(4);
    binTree.insert(7);
    binTree.insert(14);
    binTree.insert(13);


    binTree.printInOrder();

  }
}
