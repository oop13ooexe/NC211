package th.ac.utcc.cpe.data_structures.sample;

/**
 * แก้ไขให้เป็นชื่อและอีเมล์ของตัวเอง
 * @author Peerapong Tippanun <1910711102018@live4.utcc.ac.th>
 */
public class MyDict {
    // เพิ่มเติมโค้ดที่นี่เพื่อสร้างโครงสร้างข้อมูลที่ต้องการ

	
	private class LinkList {

		 
		 private Link first;
		 
		 public LinkList() {
		 
		  first = null;
		 
		 }
		 public void insertFirst(String id,String dd) {
		  
		  Link newlink = new Link(id,dd);
		  newlink.next = first;
		  first = newlink;
		  
		 }
		 

		 
		 public Link delete(String key) {
		  Link current = first;
		  Link pervious = first; 
		  
		  while(!current.iData.equals(key))
		  {
		   if(current.next==null)
		    return null;
		   else
		   {
		    pervious = current;
		    current = current.next;
		    
		   }
		    
		  }
		  
		  if(current == first)
		   first =current.next;
		  else
		   pervious.next =current.next;
		  return current;
		  
		 }
		 
		 
		 public void displayList() {
			  
			  System.out.println("------------------------------Word------------------------------");
			  Link current = first;
			  while(current!=null)
			  {
			   System.out.println(current.iData);
			   current = current.next;
			  }
			  System.out.println();
			  
			 }
			 
			 
			 
			}
	public Node root;
    
    
    // เพิ่มเติมโค้ดเพื่อสร้างเมธอด insert
    public void insert(MyWord w) {
        
    }
    public class Link {
		 
		 public String iData;
		 public String dData;
		 public Link next;
		 
		 public Link(String id,String dd) {
		  this.iData = id;
		  this.dData = dd;
		  
		 }
		 
		 public void displayLink() {
		  
		  System.out.println(iData + " is " + dData+"\n");
		  
		  
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
   
  
    
    }
	public String find(String word) {
		// TODO Auto-generated method stub
		return "สวัสดี";
	}
}
    
