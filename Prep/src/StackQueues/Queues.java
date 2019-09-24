package StackQueues;

public class Queues<T> {
	public static class QueueNode<T>{
		T data;
		QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
		
	}
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public void add(T data) {
		QueueNode<T> dataNode = new QueueNode<T>(data);
		if(last != null) {
			last.next =dataNode;
		}
		last = dataNode;
		if(first == null) {
			first = last;
		}
	}
	public T remove() {
		T data = first.data;
		first = first.next;
		if(last == null) {
			System.out.println("No Elements");
		}
		return data;
	}

}
