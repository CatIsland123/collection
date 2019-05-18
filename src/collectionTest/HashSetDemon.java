package collectionTest;

import java.util.HashSet;
import java.util.Iterator;

class student3{
	 private String name;
	  private int age;
	  student3(String n,int age){
		  this.name=n;
		  this.age=age;
	  }
	  public String getName() {
		  return this.name;
	  }
	  @Override
	public String toString() {
		return "student3 [name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		  return this.age;
	  }
	  
}
public class HashSetDemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<student3> hs=new HashSet<student3>();
	     hs.add(new student3("LIu",20));
	     hs.add(new student3("Nick",21));
	     Iterator it=hs.iterator();
	     while(it.hasNext())
	    	 System.out.println(it.next());
	}

	

}
