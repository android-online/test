
import java.util.*;
import java.util.LinkedList;

public class BinaryTree{
	
	//----------------------------------------------------
	public class Node{
	
		int data;
		Node left;
		Node right;
		
		public Node(int n ){
			this.data = n;
		}
			
	}
	//----------------------------------------------------
	
	
	Node root;
	

	public static void main(String[] args){
		
		
		BinaryTree tree1 = new BinaryTree();
		
	
		tree1.insert(10);
		tree1.insert(11);
		tree1.insert(4);
		tree1.insert(1);
		tree1.insert(6);
		
		tree1.print();
		
		tree1.size();
	
	}
		
	// lookup()
	// insert()
	// delete() - delete specific value
	// deleteMin()
	// deleteMax()
	// build123() - build a 123 tree 
	// size() - count the number of nodes in the tree
	// maxDepth() - number of nodes along the longest path 
	// minValue()
	// hasPathSum()
	// print()
	
	public BinaryTree(int n){
		this.root = new Node(n);
	}
	public BinaryTree(){};
	
	
	void insert(int n ){		// add a new node to a tree  - make recursive?
		
		//Node node = new Node(n);
		
		Node cur = this.root;
		Node prev; 
		
		
		if(cur==null){
			this.root = new Node(n);
			return;
		}
		
		while(true){

			if(cur.data > n){
				if(cur.left == null)
					cur.left = new Node(n);
				else	
					cur = cur.left;
			}
			else if(cur.data < n){
				if(cur.right == null)
					cur.right = new Node(n);
				else
					cur = cur.right;
			}
			else{
				return;
			}
		
		}
		
		
		

	}
	
	// new comment
	void print(){
		
		LevelOrderPrint(root);
	}
	
	void LevelOrderPrint(Node node){
		
			
		
			Node temp;
		
			Queue<Node> curLevel = new LinkedList<Node>();
			Queue<Node> nextLevel = new LinkedList<Node>();
			
			curLevel.add(node);
			

			while(true){
				
				if(curLevel.peek()==null && nextLevel.peek()==null)
					break;
				
				while(curLevel.peek()!=null){
					temp = curLevel.remove();
					System.out.print(temp.data+" ");
					nextLevel.add(temp.left);
					nextLevel.add(temp.right);
					
				}
				System.out.println();
				curLevel = nextLevel;
				nextLevel = new LinkedList<Node>();
				
			}

			

		
	}	
	
	void delete(int n){
		
		Queue<Node> queue = new LinkedList<Node>();
		Node temp;
		queue.add(root);
		

	}
	
	
	 void build123(){
		
		// check if root is null
		// if yes just make tree
		
		this.root = new Node(2);
		insert(1);
		insert(3);
		
	}
	
	void size(){
		int cnt = 0;
		Node temp;
		
		
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		
		
		while(queue.peek()!=null){
			temp = queue.remove();
			cnt++;
			queue.add(temp.left);
			queue.add(temp.right);
		}
		
		System.out.println("The tree has "+ cnt +" nodes");
	}
	

	
	
	
}