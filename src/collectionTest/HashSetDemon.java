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
	@Override
	public int hashCode() {
		System.out.println(this.name+"调用hashCode");
		int result;
		result = (this.name==null)?0:name.hashCode();
		result+=age; 
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(this.name+"调用equals");
		if(!(obj instanceof student3))
			return false;
		student3 s=(student3) obj;
		if(this.name.equals(s.name)&&this.age==s.age)
			return true;
		else
			return false;
		
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
	     hs.add(new student3("Aick",21));
	     hs.add(new student3("Nick",21));
	     hs.add(new student3("LIu",20));
	     hs.add(new student3("LIu",25));
	     Iterator it=hs.iterator();
	     while(it.hasNext())
	    	 System.out.println(it.next());
	}

	

}
