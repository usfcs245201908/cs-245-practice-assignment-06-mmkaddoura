public class ArrayStack<T> implements Stack<T>{

	
	/*ArrayStack(){
		 T[] a = (T[]) new Object[10];
		 int top=-1;
	}*/

	protected T[] a = (T[]) new Object[10];
	protected int top=-1;

	public boolean empty(){
		return (top == -1);
	}

	protected void growArray(){
		T[] a2 = (T[]) new Object[a.length*2];
		for(int i=0; i < a.length; i++) {
			a2[i]=a[i];
		}
		a = a2;
	}

	public T pop() {
		if(empty()) {
			throw new RuntimeException("Cannot pop. Stack is empty");
		}
		//System.out.println("Array pop");
		//printArray(a);
		
		return a[top--];
	} 

	public T peek() {
		if(empty())
			throw new RuntimeException("Cannot peek. Stack is empty");
		return a[top];
	}

	public void push(T item){
		if(top==a.length-1)
			growArray();
		a[++top]=item;
		//System.out.println("Array push");
		//printArray(a);
	}

	protected void printArray(T[] a){
		for(int i=0;i<=top;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}