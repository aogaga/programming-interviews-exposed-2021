package treendgraph;

import lombok.Data;

@Data
public class Node {
  private  Node left;
  private Node right;
  private int value;

  public Node( Node left, Node right, int value){
    this.left = left;
    this.right = right;
    this.value = value;
  }


}
