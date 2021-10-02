
public class ChildPriorityQueue {
	private int maxSize;
	private Child[] children;
	private int front;
	private int nItems;
	
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildPriorityQueue(int size) {
		this.maxSize = size;
		this.children = new Child[this.maxSize];
		this.front = 0;
		this.nItems = 0;
	}
	
	
	/**
	 * Insert new child into the queue prioritizing by age
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void insert(String firstName, String lastName, int age) {
		int j;
		if(this.nItems == 0) {
			this.children[this.nItems++] = new Child(firstName, lastName, age);
		}else {
			for(j = this.nItems - 1; j >= 0; j--) {
				if(age > this.children[j].getAge()) {
					this.children[j+1] = this.children[j];
				}else {
					break;
				}
			}
			this.children[j+1] = new Child(firstName, lastName, age);
			this.nItems ++;
		}
	}
	
	
	/**
	 * Removing child from the queue
	 * @return Child
	 */
	public Child remove() {
		Child temp = this.children[this.front++];
		if(this.front == this.maxSize) {
			this.front = 0;
		}
		this.nItems--;
		return temp;
	}
	
	
	/**
	 * Checking if the queue is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	
	/**
	 * Checking if the queue is full
	 * @return boolean
	 */
	public boolean isFull() {
		return this.nItems == this.maxSize;
	}
	
	
	/**
	 * Checking the queue size
	 * @return
	 */
	public int sise() {
		return this.nItems;
	}
	
	
	/**
	 * Displaying all the children in the queue
	 */
	public void displayQueue() {
		while(!this.isEmpty()) {
			Child child = this.remove();
			System.out.println("Full name: "+child.getFullName()+" Age: "+child.getAge());
		}
	}
}
