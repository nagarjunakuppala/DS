package info.uhcl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueArray {

	static String[] stk;
	public static final int MAXSIZE =10;
	public static int front;
	public static int rear;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		stk = new String[MAXSIZE];
		int option;
		do{
			System.out.println("Please Enter The Operation you want to perform");
			System.out.println("1 for insert:");
			System.out.println("2 for delete:");
			//System.out.println("3 for peek:");
			System.out.println("3 for show elements");
			System.out.println("4 for exit.");
			option = Integer.parseInt(br.readLine());
			switch(option){
					case 1: insert();
							continue;//break;
					case 2: delete();
							continue;//break;
					case 3: show();
							continue;
						//	continue;//break;
					case 4: System.exit(0);
			}
		}while(option != 4);
	}
	
	public static void insert() throws IOException{
		if(rear <= MAXSIZE){
			System.out.println("Enter Any string to enter  into Stack");
			 String str=br.readLine();
			stk[++rear] = str;
			System.out.println("The entered value is: "+str+" at Index position is: "+rear);
			if(front==0) front++;
			//count++;
		}else{
			System.out.println("Buffer Overflow.. Stack is already full");
		}
	}
	
	public static void delete(){
		if(front ==0 || "".equals(stk[front])){
			System.out.println("Queue is empty..");
		}else{
			//count--;
			System.out.println("Removed value is: "+stk[front]+" at position is: "+front);
			stk[front]="";
			front++;
		}
	}
	public static void show(){
		System.out.println("The Front Element is: "+stk[front]);
		System.out.println("The Last element is: "+stk[rear]);
		
	}

}
