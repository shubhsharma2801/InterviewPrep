package TreeGraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heap {
	static class MinHeap{
		int capacity =10;
		int size ;
		List<Integer> heap;
		
		public MinHeap() {
			heap = new ArrayList<Integer>();
		}
		public int peek() {
			return heap.get(0);
		}
		public int left(int i) {
			return 2*i+1;
		}
		public int right(int i) {
			return 2*i+2;
		}
		private int parent(int i) {
			// TODO Auto-generated method stub
			return (i-1)/2;
		}
		public void swap(int x,int y) {
			int temp=heap.get(x);
			heap.set(x, heap.get(y));
			heap.set(y, temp);
		}
		public int poll() throws Exception {
			if(heap == null) {
				throw new Exception("Index is out of range (Heap underflow)");
			}
			int root = heap.get(0);
			heap.set(0,heap.get(heap.size()-1));//= heap[heap.length-1];
			heapifyDown(0);
			heap.remove(heap.size()-1);
			return root;
		}
		public void add(int data) {
			heap.add(data);
			//System.out.println(heap.size()-1);
			heapifyUp(heap.size()-1);
		}
		private void heapifyUp(int i) {
			// TODO Auto-generated method stub
			int parent = parent(i);
			if(i>0 && heap.get(parent)>heap.get(i)) {
				//System.out.println("here");
				swap(i,parent);
				heapifyUp(parent(i));
			}
		}
		
		private void heapifyDown(int i) {
			// TODO Auto-generated method stub
			int left = left(i);
			int right = right(i);
			int largest = i;
			if(left < heap.size() && heap.get(left)<heap.get(i)) {
				largest =left;
			}
			if(right <heap.size() && heap.get(right)<heap.get(i)) {
				largest =right;
			}
			if(i!= largest) {
				swap(i,largest);
				heapifyDown(largest);
			}
		}
		public Integer[] toArray()
		{
			return heap.toArray(new Integer[heap.size()]);
		}
	}
	public Heap() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String args[]) {
		MinHeap mh = new MinHeap();
		mh.add(12);
		mh.add(10);
		mh.add(13);
		mh.add(2);
		mh.add(0);
		try {
			mh.poll();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer[] I = mh.toArray();
		System.out.println("Printing array: " + Arrays.toString(I));
	}
}
