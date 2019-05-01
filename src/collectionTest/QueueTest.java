package collectionTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
//实现队列
public class QueueTest {
    public static void printQ(Queue queue) {
    	while(queue.peek()!=null)
    		System.out.print(queue.remove()+" ");
    	    System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Queue<Integer>queue=new LinkedList<Integer>();
          Random rand=new Random(99);
          for(int i=0;i<10;i++)
        	  queue.offer(rand.nextInt(i+10));//产生0到i+9的数字
          printQ(queue);
          Queue<Character> qc=new LinkedList<Character>();
          for(char c:"Brontosaurus".toCharArray())
        	  qc.offer(c);
          printQ(qc);
	}

}
