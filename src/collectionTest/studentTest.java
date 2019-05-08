package collectionTest;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Student implements Comparable{//comparable是在集合内使用
	String name;
	int num;
	int goal;
	Student(String name,int num,int g){
		this.name=name;
		this.num=num;
		this.goal=g;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", goal=" + goal + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student) o;
		int result=goal>s.goal?-1:(goal==s.goal?0:1);
		return result;
	}
	
}
class studentComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		  //降序排序
			return s1.num-s2.num;
		
	}
	
}
public class studentTest {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		ArrayList <Student> list=new ArrayList<Student>();
		//Collections.sort(List list,Comparator comparator说明只能是List或者是List的子类
		//ArrayList<Student> list1=new ArrayList<Student>();
		//List<Student>list2=new ArrayList<Student>();
		Student s=new Student("刘三",03,89);
		list.add(s);
		list.add(new Student("王思维",02,66));
		list.add(new Student("Lisa",01,86));
		Collections.sort(list);
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			Student student=it.next();
			System.out.println(student);
		}
		Collections.sort(list, new studentComparator());
		System.out.println("按学号降序：");
		Iterator<Student> it2=list.iterator();
		while(it2.hasNext()) {
			Student student=it2.next();
			System.out.println(student);
		}
		}
	}






