package collectionTest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class student1 implements Comparable<student1>{
	String name;
	int num;
	int grade;
	student1(String n,int num,int g){
		this.name=n;
		this.num=num;
		this.grade=g;
	}
	@Override
	public int compareTo(student1 o) {
		// TODO Auto-generated method stub
		if(grade==o.grade) {
			return this.name.compareTo(o.name);
		}
		else
			return this.grade-o.grade;
	}
	@Override
	public String toString() {
		return "student1 [name=" + name + ", num=" + num + ", grade=" + grade + "]";
	}
}
public class TreeSetDemon {
	public static void main(String [] args) {
		Set<student1> set=new TreeSet<student1>();
		set.add(new student1("刘三",1,88));
		set.add(new student1("李三",7,98));
		set.add(new student1("陈笑三",3,58));
		set.add(new student1("林三",4,58));
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
