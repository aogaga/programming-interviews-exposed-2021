package treendgraph;

public class Bst {

  public Node findNode(Node root, int value)
  {
    while(root != null){
      int currentValue = root.getValue();
      if(currentValue == value)
        return root;
      if(currentValue < value){
        root = root.getRight();
      }else{
        root = root.getLeft();
      }
    }

    return root;
  }

  public Node findNodeRecursively(Node root, int value){

    if(root == null) return root;

    int currentValue = root.getValue();
    if(currentValue == value) return root;

    if(currentValue < value){
      return findNodeRecursively(root.getRight(), value);
    }else{
      return findNodeRecursively(root.getLeft(), value);
    }
    
  }
}
