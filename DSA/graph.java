package MYPACK;


import java.util.Scanner;

public class graph {
	private int vcount,ecount;
	private boolean adjmat[][];
	public graph(int vertexcount) {
		vcount=vertexcount;
		adjmat=new boolean [vcount][ecount];
	}
		
	public void accept(Scanner sc)
	{
		System.out.println("Enter Edge count:");
		ecount=sc.nextInt();
		System.out.println("Enter Edges(SRC,DEST);");
		for(int i=0;i<ecount;i++)
		{
			int src=sc.nextInt();
			int dest= sc.nextInt();
			adjmat[src][dest]=true;
			adjmat[dest][src]=true;
			
		}
		
		
	}
	public void print() {
		System.out.println("Graph:");
		for(int i=0;i<vcount;i++) {
			for(int j=0;j<vcount;j++) {
				System.out.println(adjmat[i][j]? "1" + " ": "0" + " ");

			}
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vertex Count");
		int vvcount=sc.nextInt();
		graph g=new graph(vvcount);
		
		g.accept(sc);
		g.print();
		sc.close();
	}

}
