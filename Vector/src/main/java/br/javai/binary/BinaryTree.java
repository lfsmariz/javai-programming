package br.javai.binary;

public class BinaryTree {

  private Node root;

  public BinaryTree() {
    root = null;
  }

  public void insert(Integer value){
    Node nodeNew = new Node(value);

    Node realRoot;
    realRoot = root;
    if(root == null){
      root = nodeNew;
      realRoot = root;
    }
    else{
      chooseLeftOrRight(nodeNew);
    }
    root = realRoot;
  }

  public void delete(Integer value){
    root = deleteRecursive(root, value);
  }

  private Node deleteRecursive(Node root, Integer value){
    //cheque se a raiz é vazia e devolva ela mesma sem alterações
    if(root == null){
      return root;
    }

    //verifica se vai percorrer pela árvore esquerda ou direita dependendo do valor do nó
    if(value > root.getValue()){
      root.setRight(deleteRecursive(root.getRight(), value));
    }
    else if(value < root.getValue()){
      root.setLeft(deleteRecursive(root.getLeft(), value));
    }

    else {
      if (root.getLeft() == null){
        return root.getRight();
      }
      else if(root.getRight() == null){
        return root.getLeft();
      }

      root.setValue(minValue(root.getRight()).getValue());

      root.setRight(deleteRecursive(root.getRight(), root.getValue()));
    }

    return root;
  }


  private void chooseLeftOrRight(Node nodeNew){
    if (nodeNew.getValue() <= root.getValue()){
      verifyLeft(nodeNew);
    } else {
      verifyRight(nodeNew);
    }
  }

  private void verifyLeft(Node nodeNew){
      if (root.getLeft() == null){
        root.setLeft(nodeNew);
      }
      else {
        root = root.getLeft();
        insert(nodeNew.getValue());
      }
  }

  private void verifyRight(Node nodeNew){
    if (root.getRight() == null){
      root.setRight(nodeNew);
    }
    else {
      root = root.getRight();
      insert(nodeNew.getValue());
    }
  }

  public void printPreOrder(){
    if(root != null){
      System.out.println(root.getValue());
      printPreOrder(root.getLeft());
      printPreOrder(root.getRight());
    }
  }

  private void printPreOrder(Node node){
    if(node != null){
      System.out.println(node.getValue());
      printPreOrder(node.getLeft());
      printPreOrder(node.getRight());
    }
  }

  public void printPostOrder(){
    if(root != null){
      printPostOrder(root.getLeft());
      printPostOrder(root.getRight());
      System.out.println(root.getValue());
    }
  }

  private void printPostOrder(Node node){
    if(node != null){
      printPostOrder(node.getLeft());
      printPostOrder(node.getRight());
      System.out.println(node.getValue());
    }
  }

  public void printInOrder(){
    if(root != null){
      printInOrder(root.getLeft());
      System.out.println(root.getValue());
      printInOrder(root.getRight());
    }
  }

  private void printInOrder(Node node){
    if(node != null){
      printInOrder(node.getLeft());
      System.out.println(node.getValue());
      printInOrder(node.getRight());
    }
  }

  public Node minValue(Node root){
    if(root.getLeft() != null){
      return minValue(root.getLeft());
    }
    return root;
  }

}
