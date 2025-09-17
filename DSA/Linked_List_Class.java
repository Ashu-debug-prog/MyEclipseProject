package LinkList;

public class Linked_List_Class {
	Node root;//
	void insertLeft(int data)
	{
		Node n=new Node(data);
		if(root==null)
			root=n;
		else 
		{
			n.next=root;
			root=n;
		}
		
		System.out.println(data+"Inserted");
	} 
	void insertRight(int data)
	{
		Node n=new Node(data);
		if(root==null)
			root=n;
		else 
		{
			n.next=root;
			root=n;
		}
		if(root==null)
			root=n;
		else 
		{
			Node t=root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
		System.out.println(data+"Inserted");
	}
	void deleteLeft()
	{
		
		if(root==null)
			System.out.println("List Empty");
		else 
		{
			 Node t=root;
			 root=root.next;//deletation takes place here by AGC
			 
			 System.out.println(t.data+"de3333"
			 		+ "leted");
			 
		}
		
		
	}
	void sort() {
		
		
		
		for (Node i=root;i!=null;i=i.next)
		{
			
			for(Node j=i.next;j!=null;j=j.next) {
				if(j.data>i.data) {
					int temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
			}
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
