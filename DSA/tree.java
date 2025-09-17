package tree;

class node{
	node right;
	node left;
	int data;
	
	node(int data){
		this.data=data;
		this.left=right=null;
	}
}

public class tree {
	node root;
	 boolean searchele(node r, int key) 
	 {
		 if(r==null)
			 return false;
		 else 
		 {
			 if(key==r.data)
				 return true;
			 else {
				 if(key<r.data)
					 return searchele(r.left, key);
				 else {
					 return searchele(r.right, key);
				 }
			 }
		 }
		 
	 }
	 void insert(node n,node r) {
		 if(root==null)
			 root=n;
		 else {
			 if(n.data<r.data) {
				 if(r.left==null)
				 {
					 r.right=r;
					 System.out.println("Inserted"+r);
				 }
			 }
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
