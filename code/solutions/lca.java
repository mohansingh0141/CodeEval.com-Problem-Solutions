package code.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class lca {

	public static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			
			this.data=data;
			this.left=null;
			this.right=null;			
		}		
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		 
		 
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		lca.Node root= new lca.Node(30);
		root.left=new lca.Node(8);
		root.right=new lca.Node(52);
		root.left.left=new lca.Node(3);
		root.left.right=new lca.Node(20);
		root.left.right.left=new lca.Node(10);
		root.left.right.right=new lca.Node(29);
		
		lca.Node startNode;
		
		

		File inFile=new File(args[0]);
		String data;
		int a;
		int b;
				
		BufferedReader in= new BufferedReader(new FileReader(inFile));		
		while((data=in.readLine())!=null){	
			startNode=root;
			String[] splits=data.split(" ");
			if(splits.length==2){								
				a=Integer.parseInt(splits[0]);
				b=Integer.parseInt(splits[1]);
				
				while(startNode!=null){
					
					if(a<startNode.getData() && b<startNode.getData()){
						startNode=startNode.getLeft();
					}
					else if(a>startNode.getData() && b>startNode.getData()){
						startNode=startNode.getRight();
					}else{
						System.out.println(startNode.getData());
						startNode=null;
					}
				}
				
				
			}
						
			
		}
		

	}

}
