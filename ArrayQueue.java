public class ArrayQueue<T> implements Queue<T>{



	protected T[] a = (T[]) new Object[10];
	protected int front=0;

	protected void growArray(){
		T[] a2 = (T[]) new Object[a.length*2];
		for(int i=0;i<a.length;i++)
			a2[i]=a[i];
		a=a2;
	}

	protected boolean full(){
		return (front>a.length);

	}

	public boolean empty(){
		return (front==0);//front<0
	}

	public T dequeue(){
		if(empty()) 
			throw new RuntimeException("Cannot dequeue. Array is empty");
		for(int i=1;i<=front;i++)
			a[i-1]=a[i];
		front--;
		return a[0];
	}

	public void enqueue(T item){
		if(front>=a.length-1)
			growArray();
		a[++front]=item;

	}


}