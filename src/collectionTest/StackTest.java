package collectionTest;

import java.util.LinkedList;

public class StackTest {
    LinkedList linkedlist=new LinkedList();
    public void push(Object obj) {
    	linkedlist.addFirst(obj);
    }
    public Object pop() {
    	return linkedlist.removeFirst();//返回第一个元素，并删除栈中该元素
    }
    public Object peek() {
    	return linkedlist.getFirst();   //返回栈中第一个元素
    }
    public boolean empty() {
    	return linkedlist.isEmpty(); //判断栈是否为空
    }
    public String toString() {
    	return linkedlist.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
