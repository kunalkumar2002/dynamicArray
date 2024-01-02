package dynamic_array;

public class dynamicArray {
	public int []arr;
	public int nextIndex;
	
	public dynamicArray() {
		 arr = new int[10];
		 nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public boolean isEmpty() {
		if(nextIndex == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void add( int val) {
		if(nextIndex == arr.length) {
			doubleCapicity();
		}
		arr[nextIndex] = val;
		nextIndex++;
	}
	
	public void doubleCapicity() {
		int temp[] = arr;
		arr = new int[temp.length*2];
		for(int i = 0 ; i< temp.length ; i++) {
			arr[i] = temp[i];
		}
	}
	
	public int get(int i) {
		if(i >= nextIndex) {
			return -1;
		}
		return arr[i];
	}
	
	public void setArray(int val , int index) {
		if(index >= nextIndex) {
			return ;
		}
		arr[index] = val;
	}
	
	public int removeLast() {
		if(nextIndex == 0) {
			return -1;
		}
		
		int temp = arr[nextIndex -1];
		arr[nextIndex-1] = 0;
		nextIndex--;
		return temp;
	}
	
}
