package th.ac.utcc.cpe.data_structures.sample;

public class Tree { private Node root;
String a="";

public Node find(String key) {
	 Node current = root;
	 while(current.iData.compareTo(key) !=0) {
	  if(key.compareTo(current.iData) != 0) 
	   current = current.leftChild;
	  else
	   current=current.rightChild;
	  if(current==null)
	   return null;
	 }
	 return current;
	 
	}

public void insert(String id,String dd) {
	 Node newNode = new Node();
	 newNode.iData=id;
	 newNode.fData=dd;
	 if(root==null)
	  root=newNode;
	 else
	 {
	  Node current = root;
	  Node parent;
	 
	  while(true) {
	   parent =current;
	   if(id.compareTo(current.iData) < 0) {
	    parent.leftChild=newNode;
	    return;
	   }
	   else
	   {
	    current = current.rightChild;
	    if(current == null) {
	     parent.rightChild =newNode;
	     return;
	    }
	   }
	  }
	 }
	} 

public boolean delete(String key) {
 Node current = root;
 Node parent = root;
 boolean isLeftChild = true;
 
 while(current.iData.compareTo(key)!=0) {
  parent = current;
  if(key.compareTo(current.iData)<0) {
   isLeftChild = true;
   current = current.leftChild;
  }
  else {
   isLeftChild = false;
   current = current.rightChild;
  }
 if(current == null) {
  System.out.println("Not found");
  return false;
 }
   
 }
 
 if(current.leftChild == null && current.rightChild == null) {
 //noChild 
  if(current == root)
   root= null;
  else if (isLeftChild)
   parent.leftChild = null;
  else
   parent.rightChild = null;
 }
 //1Child
 else if(current.rightChild == null) 
  if(current == root)
   root = current.leftChild;
  else if(isLeftChild)
   parent.leftChild = current.leftChild;
  else
   parent.rightChild = current.leftChild;
 
 else if(current.rightChild==null)
  if(current == root)
   root = current.rightChild;
  else if(isLeftChild)
   parent.leftChild = current.rightChild;
  else
   parent.rightChild = current.rightChild;
 else {
  Node successor = getSuccessor(current);
  
  if(current == root)
   root = successor;
  else if (isLeftChild)
   parent.leftChild =successor;
  else
   parent.rightChild =successor;
  successor.leftChild = current.leftChild;
  
 }
 
 return true;
 
}

private Node getSuccessor(Node delNode) {
 Node successor =delNode; 
 Node successorParent = delNode;
 Node current = delNode.rightChild;
 
 while(current != null) {
  successorParent = successor;
  successor =current;
  current = current.leftChild;
 }
 
 if(successor != delNode.rightChild) {
  
  successorParent.leftChild =successor.rightChild;
  successor.rightChild = delNode.rightChild;
 }
 return successor;
}

 public String inOder( Node localRoot) {
 
   
   if(localRoot !=null) {
    inOder(localRoot.leftChild);
    a+=localRoot.iData+"\n";
    
    inOder(localRoot.rightChild);
   }
 return a;
  
 }
 public void displayiDataInOder() {
   System.out.println("------------------------------Word------------------------------");
  System.out.println(inOder(root));
 }


	
}




	 


