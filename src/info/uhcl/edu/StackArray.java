package info.uhcl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackArray {

	static String[] stk;
	public static final int MAXSIZE =10;
	public static int count;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		stk = new String[MAXSIZE];
		int option;
		do{
			System.out.println("Please Enter The Operation you want to perform");
			System.out.println("1 for push:");
			System.out.println("2 for pop:");
			System.out.println("3 for peek:");
			System.out.println("4 for exit.");
			option = Integer.parseInt(br.readLine());
			switch(option){
					case 1: push();
							continue;//break;
					case 2: pop();
							continue;//break;
					case 3: peek();
							continue;//break;
					case 4: System.exit(0);
			}
		}while(option != 4);
	}
	
	public static void push() throws IOException{
		if(count<MAXSIZE){
			System.out.println("Enter Any string to enter  into Stack");
			 String str=br.readLine();
			System.out.println("The entered value is: "+str+" at Index position is: "+count);
			stk[count] = str;
			count++;
		}else{
			System.out.println("Buffer Overflow.. Stack is already full");
		}
	}
	
	public static void pop(){
		if(count==-1 || count ==0){
			System.out.println("Stack is empty..");
		}else{
			count--;
			System.out.println("Removed value is: "+stk[count]+" at position is: "+count);
			stk[count]="";
		}
	}
	public static void peek(){
		if(count==-1 || count ==0){
			System.out.println("Stack is empty..");
		}else{
			System.out.println("The top element is: "+stk[--count]+" at index position is: "+count);
		}
	}
}


